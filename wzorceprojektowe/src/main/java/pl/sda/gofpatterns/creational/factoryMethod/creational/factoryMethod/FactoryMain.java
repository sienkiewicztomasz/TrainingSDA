package pl.sda.gofpatterns.creational.factoryMethod.creational.factoryMethod;

public class FactoryMain {

    public static void main(String[] args) {

        ZooFactory factory = new ZooFactoryBasedOnName("Kulka");

        Animal animal = factory.createAnimal();

        animal.makeSound();

    }

}