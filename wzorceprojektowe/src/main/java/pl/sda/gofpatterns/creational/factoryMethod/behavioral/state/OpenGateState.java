package pl.sda.gofpatterns.creational.factoryMethod.behavioral.state;

public class OpenGateState implements GateState {

    @Override

    public void pay(String cardNumber) {

        System.out.println("juz zaplaciles mozesz wejsc");

    }


    @Override

    public boolean isPaymentSuccess() {

        System.out.println("platnosc zatwierdzona");

        return true;

    }

}
