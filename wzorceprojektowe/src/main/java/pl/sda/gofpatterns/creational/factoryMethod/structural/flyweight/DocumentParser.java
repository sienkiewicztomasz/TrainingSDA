package pl.sda.gofpatterns.creational.factoryMethod.structural.flyweight;

import java.time.LocalDate;


public class DocumentParser {

    public Document parseText(String documentName,

                              String fileContent,

                              LocalDate modificationDate) {

        System.out.println("Start parsing " + documentName);

        String[] split = fileContent.split("\t");

        Document document = new Document();

        document.setName(documentName);

        document.setModificationDate(modificationDate);

        document.setHeader(split[0]);

        document.setContent(split.length > 1 ? split[1] : "");

        document.setFooter(split.length > 2 ? split[2] : "");

        return document;


    }

}