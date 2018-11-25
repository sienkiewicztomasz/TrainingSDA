package pl.sda.gofpatterns.creational.factoryMethod.behavioral.strategy;

public class TrainTransportStrategy implements TransportStrategy {

    @Override

    public int getTimeRoad(String from, String to) {

        if ("bialystok".equalsIgnoreCase(from)

                && "warszawa".equalsIgnoreCase(to)) {

            return 2;

        }

        if ("poznan".equalsIgnoreCase(from)

                && "warszawa".equalsIgnoreCase(to)) {

            return 6;

        }

        return Integer.MAX_VALUE;

    }

}
