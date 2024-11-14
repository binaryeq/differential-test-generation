package io.github.bineq;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /**
     * Read a JaCoCo XML report and write a TSV-formatted list of covered methods to stdout.
     *
     * @param fName name of the JaCoCo XML report file. report.dtd must exist alongside it.
     * @param labels an array of strings to be prepended as the leftmost columns
     */
    public static void process(String fName, String[] labels) {
        String initialLabels = "";
        if (labels.length > 0) {
            initialLabels = String.join("\t", labels) + "\t";
        }

        XPath xpath = XPathFactory.newInstance().newXPath();
        // Doesn't seem to be a way to specify the following options to an XPathFactory or XPath, so a copy of
        // report.dtd needs to live next to each XML file :(
//        sax.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
//        sax.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        String expression = "/report/package/class/method/counter[@type='METHOD']";
        InputSource inputSource = new InputSource(fName);
        try {
            NodeList nodes = (NodeList) xpath.evaluate(expression, inputSource, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); ++i) {
                Node counterNode = nodes.item(i);
                String covered = getAttr(counterNode, "covered");

                Node methodNode = counterNode.getParentNode();
                String methodName = getAttr(methodNode, "name");
                String methodDescriptor = getAttr(methodNode, "desc");

                Node classNode = methodNode.getParentNode();
                String className = getAttr(classNode, "name");

                Node packageNode = classNode.getParentNode();
                String packageName = getAttr(packageNode, "name");

                String record = initialLabels + String.join("\t", new String[]{packageName, className, methodName, methodDescriptor});
                if (covered.equals("1")) {
                    System.out.println(record);
                } else if (!covered.equals("0")) {
                    throw new RuntimeException("Unexpected coverage count '" + covered + "' for record " + record);
                }
            }
        } catch (XPathExpressionException e) {
            throw new RuntimeException("XPathExpressionException occurred:", e);
        }

    }

    private static String getAttr(Node node, String attrName) {
        return node.getAttributes().getNamedItem(attrName).getTextContent();
    }

    private static String[] segmentPath(String fName) {
        // Provider, groupId (may contain slashes), artifactId, version, test class basename
        Pattern pattern = Pattern.compile("^run/([^/]+)/(.+)/([^/]+)/([^/]+)/([^/]+)\\.jacoco\\.xml$");
        Matcher matcher = pattern.matcher(fName);
        if (matcher.matches()) {
            return new String[]{ matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5) };
        } else {
            throw new RuntimeException("Could not segment path '" + fName + "'");
        }
    }

    public static void main(String[] args) {
        int iArg = 0;
        Function<String, String[]> labeler = (ignore) -> new String[]{};
        if (args.length >= iArg + 1 && args[iArg].equals("--label")) {
            final String label = args[iArg + 1];
            labeler = (ignore) -> new String[]{ label };
            iArg += 2;
        }
        if (args.length >= iArg + 1 && args[iArg].equals("--segment-path")) {
            // Assumes input filenames have the form "run/<provider>/<groupId>/<artifactId>/<version>/<test>.jacoco.xml"
            labeler = Main::segmentPath;
            iArg += 1;
        }
        if (args.length < iArg + 1) {
            System.err.println("Must specify at least one JaCoCo XML report filename.");
            System.err.println("Usage: java -cp analyse-coverage/target/classes io.github.bineq.Main [--label <label>] [--segment-path] path/to/jacoco-report1.xml [path/to/jacoco-report2.xml ...]");
            System.exit(1);
        }

        for (; iArg < args.length; ++iArg) {
            String[] labels = labeler.apply(args[iArg]);
            process(args[iArg], labels);
        }
    }
}
