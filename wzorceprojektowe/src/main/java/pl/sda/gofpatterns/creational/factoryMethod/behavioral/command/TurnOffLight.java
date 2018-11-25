package pl.sda.gofpatterns.creational.factoryMethod.behavioral.command;

public class TurnOffLight implements Command {

    private final Light light;


    public TurnOffLight(Light light) {

        this.light = light;

    }


    @Override

    public void execute() {

        light.turnOff();

    }

}