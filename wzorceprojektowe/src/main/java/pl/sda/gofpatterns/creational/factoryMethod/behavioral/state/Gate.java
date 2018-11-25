package pl.sda.gofpatterns.creational.factoryMethod.behavioral.state;

public class Gate {

    private GateState state = new CloseGateState();


    public void pay(String cardNumber) {

        state.pay(cardNumber);

        if (state.isPaymentSuccess()) {

            state = new OpenGateState();

        }

    }


    public boolean enter() {

        if (state.isPaymentSuccess()) {

            System.out.println("uzytkownik wszedl");

            state = new CloseGateState();

            return true;

        }

        System.out.println("bramka zamknieta");

        return false;

    }


}
