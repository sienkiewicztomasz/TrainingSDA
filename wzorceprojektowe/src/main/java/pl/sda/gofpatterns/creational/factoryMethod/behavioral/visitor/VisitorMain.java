package pl.sda.gofpatterns.creational.factoryMethod.behavioral.visitor;

public class VisitorMain {

    public static void main(String[] args) {

        Taxi taxi = new Taxi();

        Customer customer = new DumbCustomer("Przemek");

        customer.visitTaxi(taxi);

    }

}
