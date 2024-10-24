package io.github.bineq.featurecomp;

import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Common utilities for scripts to compare build results.
 * @author jens dietrich
 */
public class CompareBuildUtils {

    final static Logger LOG = LoggerFactory.getLogger(CompareBuildUtils.class);

    // can be replaced by renderers by a calculated number
    final static String TOTAL_COUNT = "$total_count";

    static String getProviderName(Path indexFile) {
        return indexFile.getFileName().toString()
            .replace(".tsv","")
            .replace("gav_","");
    }

    static String format(Object obj) {
       if (obj instanceof Number) {
            return NumberFormat.getInstance().format((Number) obj);
        }
        else {
            return ""+obj;
        }
    }

    static Set<Record> parseRecords(Path indexFile) throws IOException {
        return Files.lines(indexFile)
            .map(line -> {
                try {
                    return Record.parse(safeGetParent(indexFile),line);
                } catch (MalformedURLException e) {
                    LOG.error("Error parsing " + indexFile + " ,  line: " + line);
                    throw new RuntimeException(e);
                }
            })
            .collect(Collectors.toUnmodifiableSet());
    }

    private static Path safeGetParent(Path indexFile) {
        return indexFile.getNameCount() > 1 ? indexFile.getParent() : Path.of("");
    }

    static String format(int i) {
        return NumberFormat.getNumberInstance().format(i);
    }

    static String format(long i) {
        return NumberFormat.getNumberInstance().format(i);
    }

    static Set<String> entries(File jar) throws IOException {
        try (ZipFile zip = new ZipFile(jar)) {
            Set<String> classes = new TreeSet<>();
            Enumeration<? extends ZipEntry> iter = zip.entries();
            while (iter.hasMoreElements()) {
                String s = iter.nextElement().getName();
                classes.add(s);
            }
            return Collections.unmodifiableSet(classes);
        }
        catch (Exception x) {
            throw new IOException("Error reading from zip file " + jar,x);
        }
    }

    static Set<String> entries(File jar, Predicate<String> fileFilter) throws IOException {
        return entries(jar)
            .stream()
            .filter(fileFilter)
            .collect(Collectors.toSet());
    }

    /**
     * Find common records -- both records are for the same GAV.
     * @param records1
     * @param records2
     * @return
     */
    static Set<PairOfRecords> findCommonRecords(Set<Record> records1, Set<Record> records2) {
        Map<String,Record> recordsByGAV1 = new HashMap<>();
        Map<String,Record> recordsByGAV2 = new HashMap<>();

        records1.stream().forEach(record -> recordsByGAV1.put(record.gav(),record));
        records2.stream().forEach(record -> recordsByGAV2.put(record.gav(),record));

        return Sets.intersection(recordsByGAV1.keySet(),recordsByGAV2.keySet())
            .stream()
            .map(gav -> new PairOfRecords(recordsByGAV1.get(gav),recordsByGAV2.get(gav)))
            .collect(Collectors.toSet());
    }
}
