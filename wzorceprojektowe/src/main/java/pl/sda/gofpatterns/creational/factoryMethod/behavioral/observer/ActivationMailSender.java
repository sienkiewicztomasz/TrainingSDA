package pl.sda.gofpatterns.creational.factoryMethod.behavioral.observer;

public class ActivationMailSender implements Observer {


    public void send(Person person) {

        System.out.println("wyslano maila aktywacyjnego do: " + person);

    }


    @Override

    public void update(Person person) {

        send(person);

    }

}