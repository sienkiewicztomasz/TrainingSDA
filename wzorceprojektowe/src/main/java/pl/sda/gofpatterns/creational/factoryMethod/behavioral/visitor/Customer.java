package pl.sda.gofpatterns.creational.factoryMethod.behavioral.visitor;

public interface Customer {

    String getName();

    void visitTaxi(Taxi taxi);

}
