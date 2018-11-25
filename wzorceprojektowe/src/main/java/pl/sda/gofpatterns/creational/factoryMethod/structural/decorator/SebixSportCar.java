package pl.sda.gofpatterns.creational.factoryMethod.structural.decorator;

public class SebixSportCar extends CarDecorator {

    public SebixSportCar(Car car) {

        super(car);

    }


    @Override

    public void assemble() {

        super.assemble();

        System.out.println("Lawka zamiast spojlera zamontowana.");

    }

}
