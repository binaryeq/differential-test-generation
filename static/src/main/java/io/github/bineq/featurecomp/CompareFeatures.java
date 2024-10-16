package io.github.bineq.featurecomp;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
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
                        String provider2 = providers.get(j);
                        Set<Record> records2 = setsOfRecords.get(j);

                        LOG.info("Comparing:" + provider1 + " , "+ provider2);

                        // GUARD TO ONLY COMPARE RECORDS WITH MATCHING SOURCE FILES !
                        Set<PairOfRecords> pairOfRecords = findMatchingRecordsWithSameSources(provider1, provider2, records1, records2);

                        Set<Record> matchingRecords1 = pairOfRecords.stream().map(p -> p.left()).collect(Collectors.toSet());
                        Set<Record> matchingRecords2 = pairOfRecords.stream().map(p -> p.right()).collect(Collectors.toSet());

                        LOG.info("Matching records (GAVs with equivalent sources for both providers): " + pairOfRecords.size());

                        Map<String, Object> prov = new HashMap<>();
                        prov.put("provider1", provider1);
                        prov.put("provider2", provider2);

                        PairOfProviders comparedProviders = new PairOfProviders(provider1, provider2);
                        PairOfProviders comparedProvidersReversed = comparedProviders.swap();

                        // .compare(provider1, provider2, matchingRecords1, matchingRecords2);
                        LOG.warn("todo: comparison");
                    }
                }

            }
        catch (Exception x) {
            LOG.error(x.getMessage(),x);
        }
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
