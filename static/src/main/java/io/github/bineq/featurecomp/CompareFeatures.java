package io.github.bineq.featurecomp;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import io.github.bineq.Content;
import io.github.bineq.ContentClassification;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static io.github.bineq.featurecomp.CompareBuildUtils.*;

/**
 * Compare the results of alternative builds based on features.
 * @author jens dietrich
 */
public class CompareFeatures {

    final static Logger LOG = LoggerFactory.getLogger(CompareFeatures.class);

    final static Path SAME_SOURCE_CACHE = Path.of(".same_sources.json");
    final static Path RESULT_FOLDER = Path.of("results");

    private static Map<String,Map<String,Set<String>>> GAVS_WITH_SAME_RESOURCES = loadSameSourcesCache();

    final static Option HELP = Option.builder()
            .argName("help")
            .option("h")
            .longOpt("help")
            .required(false)
            .desc("help")
            .build();

    final static Options OPTIONS = new Options()
            .addOption(HELP);

    static Map<String,Map<String,Set<String>>>  loadSameSourcesCache() {
        try (FileReader reader = new FileReader(SAME_SOURCE_CACHE.toFile())) {
            Map<String,Map<String,Set<String>>>  table = new Gson().fromJson(reader,HashMap.class);
            LOG.info("Same source cache loaded");
            return table;
        } catch (Exception x) {
           LOG.error("Error loading same same source cache, using empty table",x);
           return new HashMap<>();
        }
    }

    private static Set<String> readFromSameSourcesCache(String provider1, String provider2) {
        Set<String> gavs = null;
        Collection<String> gavs2 = null;
        Map<String,Set<String>> map = GAVS_WITH_SAME_RESOURCES.get(provider1);
        if (map!=null) {
            gavs2  = map.get(provider2); // imported as ArrayList
            if (gavs2!=null) {
                gavs = gavs2.stream().collect(Collectors.toSet());
            }
        }
        // entries are symmetric !
        if (gavs==null) {
            map = GAVS_WITH_SAME_RESOURCES.get(provider2);
            if (map!=null) {
                gavs2  = map.get(provider1);
                if (gavs2!=null) {
                    gavs = gavs2.stream().collect(Collectors.toSet());
                }
            }
        }

        if (gavs!=null) {
            LOG.info("Same source cache with GAVs used for " + provider1 + " and " + provider2 + " - " + gavs.size() + " gavs");
        }
        return gavs;
    }


    public static void main (String[] args) throws Exception {
        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cli = parser.parse(OPTIONS, args);

            if (cli.hasOption(HELP)) {
                showUsage();
                System.exit(0);
            }

            Preconditions.checkArgument(cli.getArgs().length > 1, "at least two datasets (index files *.tsv) are required");


            List<Path> datasets = Stream.of(cli.getArgs())
                    .map(arg -> {
                        Path path = Path.of(arg);
                        Preconditions.checkArgument(Files.exists(path));
                        Preconditions.checkArgument(path.toString().endsWith(".tsv"));
                        return path;
                    })
                    .collect(Collectors.toUnmodifiableList());

            List<String> providers = datasets.stream()
                    .map(f -> getProviderName(f))
                    .collect(Collectors.toUnmodifiableList());

            List<Set<Record>> setsOfRecords = datasets.stream()
                    .map(f -> {
                        try {
                            LOG.info("Parsing records from " + f);
                            Set<Record> records = parseRecords(f);
                            LOG.info("\t" + records.size() + " parsed");
                            return records;
                        } catch (IOException e) {
                            LOG.error("Error parsing " + f);
                            throw new RuntimeException(e);
                        }
                    }).collect(Collectors.toUnmodifiableList());


                for (int i = 0; i < datasets.size(); i++) {
                    String provider1 = providers.get(i);
                    Set<Record> records1 = setsOfRecords.get(i);
                    for (int j = 0; j < datasets.size(); j++) {

                        if (i!=j) {

                            String provider2 = providers.get(j);
                            Set<Record> records2 = setsOfRecords.get(j);

                            LOG.info("Comparing:" + provider1 + " , " + provider2);

                            // GUARD TO ONLY COMPARE RECORDS WITH MATCHING SOURCE FILES !
                            Set<PairOfRecords> commonRecords = findMatchingRecordsWithSameSources(provider1, provider2, records1, records2);
                            LOG.info("Matching records (GAVs with equivalent sources for both providers): " + commonRecords.size());


                            AtomicInteger counter = new AtomicInteger(0);
                            commonRecords.stream().forEach(pairOfRecords -> {

                                String gav = pairOfRecords.left().gav();
                                try {
                                    if (counter.incrementAndGet() % 1 == 0) {
                                        LOG.debug("progress:" + counter.get() + " / " + commonRecords.size());
                                        LOG.debug("\tcurrent gav: " + gav);
                                    }

                                    Set<String> listOfDiffClasses = new TreeSet<>();
                                    Map<String, Set<String>> classesWithDiffFeatures1 = new HashMap<>();
                                    Map<String, Set<String>> classesWithDiffFeatures2 = new HashMap<>();
                                    Set<String> diffClasses1 = new TreeSet<>();
                                    Set<String> diffClasses2 = new TreeSet<>();
                                    Set<String> commonClasses = new TreeSet<>();

                                    Set<String> bin1 = entries(
                                        pairOfRecords.left().binMainFile().toFile(),
                                        f -> ContentClassification.isByteCode(f)
                                    );
                                    Set<String> bin2 = entries(
                                        pairOfRecords.right().binMainFile().toFile(),
                                        f -> ContentClassification.isByteCode(f)
                                    );
                                    commonClasses.addAll(Sets.intersection(bin1, bin2));
                                    diffClasses1.addAll(Sets.difference(bin1, bin2));
                                    diffClasses2.addAll(Sets.difference(bin2, bin1));

                                    for (String commonClass : commonClasses) {
                                        Content content1 = new Content(pairOfRecords.left().binMainFile(), commonClass);
                                        Content content2 = new Content(pairOfRecords.right().binMainFile(), commonClass);

                                        // any difference
                                        try {
                                            if (!Arrays.equals(content1.load(), content2.load())) {
                                                listOfDiffClasses.add(commonClass);


                                                // look for feature difference
                                                Set<String> features1 = ComputeBytecodeSummary.computeMemberSummary(content1);
                                                Set<String> features2 = ComputeBytecodeSummary.computeMemberSummary(content2);

                                                Set<String> diff1 = Sets.difference(features1, features2);
                                                Set<String> diff2 = Sets.difference(features2, features1);

                                                if (!diff1.isEmpty()) {
                                                    classesWithDiffFeatures1.put(commonClass, new TreeSet(diff1));
                                                }
                                                if (!diff2.isEmpty()) {
                                                    classesWithDiffFeatures2.put(commonClass, new TreeSet(diff2));
                                                }
                                            }
                                        } catch (Exception e) {
                                            LOG.error("Error comparing " + commonClass, e);
                                        }

                                    }


                                    // write output

                                    if (!listOfDiffClasses.isEmpty()) {
                                        Path f = null;
                                        Path dir = RESULT_FOLDER
                                            .resolve(provider1.toString())
                                            .resolve(provider2.toString())
                                            .resolve(gav.replace(":", "__"));
                                        Files.createDirectories(dir);

                                        if (!diffClasses1.isEmpty()) {
                                            f = dir.resolve("different-classes1.list");
                                            Files.write(f, diffClasses1);
                                        }

                                        if (!diffClasses2.isEmpty()) {
                                            f = dir.resolve("different-classes2.list");
                                            Files.write(f, diffClasses2);
                                        }

                                        f = dir.resolve("common-classes.list");
                                        Files.write(f, commonClasses);

                                        f = dir.resolve("nonequal-classes.list");
                                        Files.write(f, listOfDiffClasses);

                                        if (!classesWithDiffFeatures1.isEmpty()) {
                                            Set<String> diffFeatures = flatten(classesWithDiffFeatures1);
                                            f = dir.resolve("different-features1.list");
                                            Files.write(f, diffFeatures);
                                        }

                                        if (!classesWithDiffFeatures2.isEmpty()) {
                                            Set<String> diffFeatures = flatten(classesWithDiffFeatures2);
                                            f = dir.resolve("different-features2.list");
                                            Files.write(f, diffFeatures);
                                        }

                                    }
                                }
                                catch (Exception e) {
                                    // LOG.error(e.getMessage(),e);
                                }
                            });

                        }
                    }
                }
        }

        catch (Exception x) {
            LOG.error(x.getMessage(),x);
        }
    }

    private static Set<String> flatten(Map<String,Set<String>> map) {
        Set<String> flat = new TreeSet<>();
        for (String cl:map.keySet()) {
            for (String feature:map.get(cl)) {
                flat.add(cl + "//" + feature);
            }
        }
        return flat;
    }

    private static void showUsage() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -cp <path-to-built-jar> " + CompareFeatures.class.getName() + " <provider1>.tsv <provider2>.tsv [<provider3>.tsv ...]", OPTIONS);
    }

    /**
     * Find records with matching jars.
     * I.e. for each pair the following is true:
     * 1. the GAVs for both records are the same
     * 2. both have the same set of source files
     * 3. the commons source files have equivalent content (modulo some equivalence relation)
     * @param records1
     * @param records2
     * @return set of GAVs for which records exist in both sets
     */
    static Set<PairOfRecords> findMatchingRecordsWithSameSources(String provider1, String provider2, Set<Record> records1, Set<Record> records2) throws IOException {
        final Set<PairOfRecords> commonRecords = findCommonRecords(records1,records2);
        Set<String> gavsWithSameSources = readFromSameSourcesCache(provider1,provider2);
        LOG.info("Same source cache with GAVs used for " + provider1 + " and " + provider2);
        return commonRecords.stream()
            .filter(p -> gavsWithSameSources.contains(p.left().gav()))
            .collect(Collectors.toSet());
    }


}
