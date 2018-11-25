package pl.sda.gofpatterns.creational.factoryMethod.structural.flyweight;

import java.time.LocalDate;

import java.util.HashMap;

import java.util.Map;


public class DocumentParserFlyweightFactory {


    private final DocumentParser parser;

    private final Map<Long, Document> library = new HashMap<>();

    public DocumentParserFlyweightFactory(DocumentParser parser) {

        this.parser = parser;

    }


    Document getDocument(String documentName,

                         String content,

                         LocalDate modificationDate) {

        long epochDay = modificationDate.toEpochDay();

        Document document = library.get(epochDay);

        if (document == null) {

            document = parser.parseText(documentName, content, modificationDate);

            library.put(epochDay, document);

        }

        return document;


    }

}
