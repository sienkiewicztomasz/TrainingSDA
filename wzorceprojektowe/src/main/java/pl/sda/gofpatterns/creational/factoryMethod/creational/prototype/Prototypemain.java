package pl.sda.gofpatterns.creational.factoryMethod.creational.prototype;

public class Prototypemain {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeComputerBuilder builder = new PrototypeComputerBuilder();
        Computer computer1 = builder.build();
        Computer computer2 = builder.build();

        System.out.println(computer1 == computer2);


    }
}
