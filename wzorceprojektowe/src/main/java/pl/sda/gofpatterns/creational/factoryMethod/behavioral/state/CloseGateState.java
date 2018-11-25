package pl.sda.gofpatterns.creational.factoryMethod.behavioral.state;

import java.util.Arrays;

import java.util.List;


public class CloseGateState implements GateState {

    List<String> cards = Arrays.asList(

            "12345",

            "98765",

            "11111",

            "00000"

    );

    private boolean payment = false;


    @Override

    public void pay(String cardNumber) {

        if (cards.contains(cardNumber)) {

            payment = true;

        } else {

            payment = false;

        }

    }


    @Override

    public boolean isPaymentSuccess() {

        return payment;

    }

}