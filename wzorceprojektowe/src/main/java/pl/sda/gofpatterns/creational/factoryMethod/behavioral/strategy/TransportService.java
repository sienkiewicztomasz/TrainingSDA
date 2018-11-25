package pl.sda.gofpatterns.creational.factoryMethod.behavioral.strategy;

public class TransportService {

    private TransportStrategy transportStrategy;


    public TransportService(TransportStrategy transportStrategy) {

        this.transportStrategy = transportStrategy;

    }


    public int getRoadTime(String from, String to) {

        return transportStrategy.getTimeRoad(from, to);

    }

}
