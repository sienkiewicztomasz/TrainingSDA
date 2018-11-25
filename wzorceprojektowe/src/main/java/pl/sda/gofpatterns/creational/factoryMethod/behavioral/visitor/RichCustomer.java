package pl.sda.gofpatterns.creational.factoryMethod.behavioral.visitor;

public class RichCustomer implements Customer {

    private String name;


    public RichCustomer(String name) {

        this.name = name;

    }


    @Override

    public String getName() {

        return "KRUSZWIL: " + name;

    }


    @Override

    public void visitTaxi(Taxi taxi) {

        taxi.handleCustomer(this);

    }

}
