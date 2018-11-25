package pl.sda.gofpatterns.creational.factoryMethod.behavioral.template.interfaceexample;

public interface Printer {

    default void print() {

        prepareDocument();

        loadPaper();

        loadInk();

        printDocument();

    }


    void printDocument();


    void loadInk();


    void loadPaper();


    void prepareDocument();

}