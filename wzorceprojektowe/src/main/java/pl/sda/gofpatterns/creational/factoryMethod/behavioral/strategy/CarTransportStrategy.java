package pl.sda.gofpatterns.creational.factoryMethod.behavioral.strategy;

public class CarTransportStrategy implements TransportStrategy {

    @Override

    public int getTimeRoad(String from, String to) {

        if ("bialystok".equalsIgnoreCase(from)

                && "warszawa".equalsIgnoreCase(to)) {

            return 1;

        }

        if ("poznan".equalsIgnoreCase(from)

                && "warszawa".equalsIgnoreCase(to)) {

            return 4;

        }

        return 10;

    }

}