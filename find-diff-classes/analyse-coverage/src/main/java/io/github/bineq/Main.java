package io.github.bineq;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class Main {
    public static void process(String fName) {
        XPath xpath = XPathFactory.newInstance().newXPath();
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

                System.out.println("package: " + packageName + ", class: " + className + ", method: " + methodName + ", covered: " + covered);
            }
        } catch (XPathExpressionException e) {
            throw new RuntimeException("XPathExpressionException occurred:", e);
        }

    }

    private static String getAttr(Node node, String attrName) {
        return node.getAttributes().getNamedItem(attrName).getTextContent();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Must specify a JaCoCo XML report filename.");
            System.exit(1);
        }

        process(args[0]);
    }
}
