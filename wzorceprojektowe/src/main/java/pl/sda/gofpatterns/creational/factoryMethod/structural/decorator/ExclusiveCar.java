package pl.sda.gofpatterns.creational.factoryMethod.structural.decorator;

public class ExclusiveCar extends CarDecorator {

    public ExclusiveCar(Car car) {

        super(car);

    }


    @Override

    public void assemble() {

        super.assemble();

        System.out.println("Malujemy zlote napisy..");

    }

}
