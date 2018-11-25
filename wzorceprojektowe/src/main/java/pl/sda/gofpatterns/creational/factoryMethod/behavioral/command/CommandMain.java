package pl.sda.gofpatterns.creational.factoryMethod.behavioral.command;

public class CommandMain {

    public static void main(String[] args) {

        Light light1 = new Light();

        RemoteController controller =

                new RemoteController(light1);

//        controller.setButton1(new TurnOffLight(light1));

        System.out.println(light1);

        controller.clickButton1();

        System.out.println(light1);

        controller.clickButton2();

        System.out.println(light1);

    }

}