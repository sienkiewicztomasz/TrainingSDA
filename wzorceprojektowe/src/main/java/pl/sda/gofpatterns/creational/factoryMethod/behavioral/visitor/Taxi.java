package pl.sda.gofpatterns.creational.factoryMethod.behavioral.visitor;

public class Taxi {

    void handleCustomer(PoorCustomer customer) {

        System.out.println("poprosze 30 PLN");

    }

    void handleCustomer(RichCustomer customer) {

        System.out.println("poprosze 30 EUR");

    }

    void handleCustomer(Customer customer) {

        System.out.println("poprosze 80 PLN");

    }

}