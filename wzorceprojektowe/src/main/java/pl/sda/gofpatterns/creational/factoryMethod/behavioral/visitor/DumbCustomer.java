package pl.sda.gofpatterns.creational.factoryMethod.behavioral.visitor;

public class DumbCustomer implements Customer {

    private final String name;


    public DumbCustomer(String name) {


        this.name = name;

    }


    @Override

    public String getName() {

        return "Hej ja " + name;

    }


    @Override

    public void visitTaxi(Taxi taxi) {

        taxi.handleCustomer(this);

    }

}
