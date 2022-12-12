import controller.KnifesDomParser;
import controller.KnifesSaxParser;
import controller.KnifesStaxParser;
import models.KnifesDesc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        String xmlFile = "src/xml/knifes.xml";
        String xsdFile = "src/xml/knifes2.xsd";

        System.out.println("--------------Running DOM parsing ------------------------");
        List<KnifesDesc> knifesDom = new KnifesDomParser().parseDocument(xmlFile);
        sortKnifes(knifesDom);
        System.out.println("----print result ------------------------");
        printKnifes(knifesDom);
        System.out.println("--------------Running SAX parsing ------------------------");
        List<KnifesDesc> knifesSax = new KnifesSaxParser().parseDocument(xmlFile);
        sortKnifes(knifesSax);
        System.out.println("----print result ------------------------");
        printKnifes(knifesSax);
        System.out.println("--------------Running STAX parsing -----------------------");
        List<KnifesDesc> knifesStax = new KnifesStaxParser().parseDocument(xmlFile);
        sortKnifes(knifesStax);
        System.out.println("----print result ------------------------");
        printKnifes(knifesStax);

    }


    private static void sortKnifes(List<KnifesDesc> knifes) {
        Collections.sort(knifes, new Comparator<KnifesDesc>() {
            @Override
            public int compare(KnifesDesc o1, KnifesDesc o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


    private static void printKnifes(List<KnifesDesc> knifes) {
        for (KnifesDesc knife : knifes) {
            System.out.println("Name: " + knife.getName());
            System.out.println("Type: " + knife.getKnifeType());
            System.out.println("Handy: " + knife.getKnifeHandy());
            System.out.println("Origin: " + knife.getKnifeOrigin());
            System.out.println("Blade: " + knife.getKnifeVisual().getKnifeBlade().getLength() +
                    " " + knife.getKnifeVisual().getKnifeBlade().getWidth() + " " +
                    knife.getKnifeVisual().getKnifeBlade().getMetal());
            System.out.println("Collection: " + knife.isCollection());
            System.out.println("");
        }
    }
}