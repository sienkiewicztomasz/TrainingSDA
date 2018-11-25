package pl.sda.gofpatterns.creational.factoryMethod.behavioral.command;

public class Light {

    private boolean flash = false;

    public void turnOn() {

        flash = true;

    }

    public void turnOff() {

        flash = false;

    }


    @Override

    public String toString() {

        if (flash) {

            return "Swiatlo wlaczone";

        }

        return "Swiatlo wylaczone";

    }

}
