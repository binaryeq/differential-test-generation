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
                NamedNodeMap counterAttr = counterNode.getAttributes();
                Node covered = counterAttr.getNamedItem("covered");

                Node methodNode = counterNode.getParentNode();
                NamedNodeMap methodAttr = methodNode.getAttributes();
                Node methodName = methodAttr.getNamedItem("name");
                Node methodDescriptor = methodAttr.getNamedItem("desc");

                Node classNode = methodNode.getParentNode();
                NamedNodeMap classAttr = classNode.getAttributes();
                Node className = classAttr.getNamedItem("name");

                Node packageNode = classNode.getParentNode();
                NamedNodeMap packageAttr = packageNode.getAttributes();
                Node packageName = packageAttr.getNamedItem("name");

                System.out.println("package: " + packageName + ", class: " + className + ", method: " + methodName + ", covered: " + covered.getTextContent());
            }
        } catch (XPathExpressionException e) {
            throw new RuntimeException("XPathExpressionException occurred:", e);
        }

    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Must specify a JaCoCo XML report filename.");
            System.exit(1);
        }

        process(args[0]);
    }
}
