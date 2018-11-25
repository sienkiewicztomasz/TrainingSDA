package pl.sda.gofpatterns.creational.factoryMethod.structural.flyweight;

import java.time.LocalDate;


public class Document {

    private String name;

    private String header;

    private String content;

    private String footer;

    private LocalDate modificationDate;

    public Document() {


    }

    public Document(String name, String header, String content, String footer, LocalDate modificationDate) {

        this.name = name;

        this.header = header;

        this.content = content;

        this.footer = footer;

        this.modificationDate = modificationDate;

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setHeader(String header) {

        this.header = header;

    }


    public void setContent(String content) {

        this.content = content;

    }


    public void setFooter(String footer) {

        this.footer = footer;

    }


    public void setModificationDate(LocalDate modificationDate) {

        this.modificationDate = modificationDate;

    }


    public String getName() {

        return name;

    }


    public String getHeader() {

        return header;

    }


    public String getContent() {

        return content;

    }


    public String getFooter() {

        return footer;

    }


    @Override

    public String toString() {

        return "Document{" +

                "name='" + name + '\'' +

                ", header='" + header + '\'' +

                ", content='" + content + '\'' +

                ", footer='" + footer + '\'' +

                '}';

    }


    public LocalDate getModificationDate() {

        return modificationDate;

    }

}
