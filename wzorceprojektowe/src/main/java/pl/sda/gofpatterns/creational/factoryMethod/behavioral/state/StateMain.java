package pl.sda.gofpatterns.creational.factoryMethod.behavioral.state;

public class StateMain {

    public static void main(String[] args) {

        Gate gate = new Gate();

        gate.enter();

        gate.pay("00000");

        gate.enter();

        gate.enter();

    }

}
