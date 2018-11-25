package pl.sda.gofpatterns.creational.factoryMethod.behavioral.state;

public interface GateState {

    void pay(String cardNumber);

    boolean isPaymentSuccess();

}
