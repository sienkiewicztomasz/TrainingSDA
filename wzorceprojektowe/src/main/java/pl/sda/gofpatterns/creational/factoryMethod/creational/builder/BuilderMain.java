package pl.sda.gofpatterns.creational.factoryMethod.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {


        VehicleBuilder builder = new AmericanVehicleBuilder();
        builder.setTank(100);
        builder.addWheel();
        builder.addWheel();
        builder.addWheel();
        Vehicle vehicle = builder.build();
        builder.addWheel();
        Vehicle vehicle2 = builder.build();
        System.out.println();


    }
}
