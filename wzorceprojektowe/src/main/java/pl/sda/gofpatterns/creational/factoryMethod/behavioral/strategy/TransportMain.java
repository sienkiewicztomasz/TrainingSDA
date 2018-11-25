package pl.sda.gofpatterns.creational.factoryMethod.behavioral.strategy;

public class TransportMain {

    public static void main(String[] args) {

        TransportStrategy transportStrategy

                = new TrainTransportStrategy();

        TransportService transportService

                = new TransportService(transportStrategy);

        int roadTime = transportService.getRoadTime("bialystok", "warszawa");

        System.out.println(roadTime);

    }

}
