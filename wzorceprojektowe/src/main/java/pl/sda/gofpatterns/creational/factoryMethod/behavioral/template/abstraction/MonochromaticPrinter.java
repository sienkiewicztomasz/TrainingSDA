package pl.sda.gofpatterns.creational.factoryMethod.behavioral.template.abstraction;

public class MonochromaticPrinter extends Printer {

    @Override

    protected void printDocument() {

        System.out.println("drukuje dokument");

    }



    @Override

    protected void loadInk() {

        System.out.println("pobieram czarny tusz");

    }



    @Override

    protected void loadPaper() {

        System.out.println("laduje papier");

    }



    @Override

    protected void prepareDocument() {

        System.out.println("zamien kolory w dokumencie na skale szarosci");

    }

}
