package pl.sda.gofpatterns.creational.factoryMethod.structural.flyweight;

import java.time.LocalDate;


public class FlyweightMain {

    public static void main(String[] args) {

        DocumentParser parser = new DocumentParser();

        DocumentParserFlyweightFactory flyweightFactory

                = new DocumentParserFlyweightFactory(parser);

        Document doc1 = flyweightFactory.getDocument("Doc1",

                "Hej\n\tCo tam u ciebie?",

                LocalDate.of(2001, 10, 20));


        Document doc2 = flyweightFactory.getDocument("Doc2",

                "Hej\n\tCo tam u ciebie?",

                LocalDate.of(2001, 10, 20));

        Document doc3 = flyweightFactory.getDocument("Doc3",

                "Hej\n\tU mnie spoko? \n\tnarka",

                LocalDate.of(2001, 11, 20));


        System.out.println(doc1);

        System.out.println(doc2);

        System.out.println(doc3);

    }

}
