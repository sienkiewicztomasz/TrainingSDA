package pl.sda.gofpatterns.creational.factoryMethod.behavioral.template.interfaceexample;

public class OfficePrinter implements Printer {

    @Override

    public void printDocument() {

        System.out.println("drukuje kartki");

    }


    @Override

    public void loadInk() {

        System.out.println("pobieram tusz");

    }


    @Override

    public void loadPaper() {

        System.out.println("pobieram kartke A4");


    }


    @Override

    public void prepareDocument() {

        System.out.println("obliczam rozmiar kartki");

    }

}
