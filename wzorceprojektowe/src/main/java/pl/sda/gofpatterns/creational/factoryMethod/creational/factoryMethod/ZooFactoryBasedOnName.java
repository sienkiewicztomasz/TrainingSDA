package pl.sda.gofpatterns.creational.factoryMethod.creational.factoryMethod;

public class ZooFactoryBasedOnName implements ZooFactory {

    private final String name;


    public ZooFactoryBasedOnName(String name) {

        this.name = name;

    }


    public Animal createAnimal() {

        if (name.endsWith("a")) {

            return new Cat();

        }

        return new Dog();

    }

}
