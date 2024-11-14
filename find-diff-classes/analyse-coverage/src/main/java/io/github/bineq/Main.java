package io.github.bineq;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.XMLConstants;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class Main {
    /**
     * Read a JaCoCo XML report and write a TSV-formatted list of covered methods to stdout.
     *
     * @param fName name of the JaCoCo XML report file. report.dtd must exist alongside it.
     * @param label if non-null, will be prepended as the leftmost column
     */
    public static void process(String fName, String label) {
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

                String record = (label == null ? "" : label + "\t") + String.join("\t", new String[]{packageName, className, methodName, methodDescriptor});
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

    public static void main(String[] args) {
        int iArg = 0;
        String label = null;
        if (args.length >= iArg + 1 && args[iArg].equals("--label")) {
            label = args[iArg + 1];
            iArg += 2;
        }
        if (args.length != iArg + 1) {
            System.err.println("Must specify a JaCoCo XML report filename.");
            System.exit(1);
        }

        process(args[iArg], label);
    }
}
