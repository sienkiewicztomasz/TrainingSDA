package pl.sda.gofpatterns.creational.factoryMethod.behavioral.command;

public class TurnOnLight implements Command {

    private final Light light;


    public TurnOnLight(Light light) {

        this.light = light;

    }


    @Override

    public void execute() {

        light.turnOn();

    }

}