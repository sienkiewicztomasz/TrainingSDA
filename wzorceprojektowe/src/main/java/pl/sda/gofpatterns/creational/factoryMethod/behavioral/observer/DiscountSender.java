package pl.sda.gofpatterns.creational.factoryMethod.behavioral.observer;

public class DiscountSender implements Observer {

    public void send(Person person) {

        System.out.println("Wyslano kod WITAJ20 do: " + person);

    }


    @Override

    public void update(Person person) {

        send(person);

    }

}
