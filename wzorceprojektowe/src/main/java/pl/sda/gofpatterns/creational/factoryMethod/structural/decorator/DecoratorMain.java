package pl.sda.gofpatterns.creational.factoryMethod.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Car car = new BasicVolvoCar();

//        car.assemble();

        Car exclusiveCar = new ExclusiveCar(car);

        exclusiveCar.assemble();


        Car sebixExclusiveCar = new SebixSportCar(

                new ExclusiveCar(car));

        sebixExclusiveCar.assemble();

    }

}
