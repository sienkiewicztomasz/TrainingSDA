package pl.sda.gofpatterns.creational.factoryMethod.behavioral.template.interfaceexample;

public class PrinterMain {

    public static void main(String[] args) {

        Printer printer = new OfficePrinter();

        printer.print();

    }

}
