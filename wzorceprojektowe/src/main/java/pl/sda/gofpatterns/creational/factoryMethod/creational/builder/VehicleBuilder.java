package pl.sda.gofpatterns.creational.factoryMethod.creational.builder;

public interface VehicleBuilder {

    Vehicle build();

    VehicleBuilder addWheel();

    VehicleBuilder setTank(int size);

}