package pl.sda.gofpatterns.creational.factoryMethod.behavioral.visitor;

public class PoorCustomer implements Customer {

    private String name;


    public PoorCustomer(String name) {

        this.name = name;

    }


    @Override

    public String getName() {

        return "BIEDAK: " + name;

    }


    @Override

    public void visitTaxi(Taxi taxi) {

        taxi.handleCustomer(this);

    }

}