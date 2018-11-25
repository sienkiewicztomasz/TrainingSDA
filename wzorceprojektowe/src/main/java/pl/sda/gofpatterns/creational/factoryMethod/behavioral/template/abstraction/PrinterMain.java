package pl.sda.gofpatterns.creational.factoryMethod.behavioral.template.abstraction;

public class PrinterMain {

    public static void main(String[] args) {

        Printer printer = new MonochromaticPrinter();

        printer.print();

    }

}
