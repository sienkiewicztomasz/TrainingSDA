package pl.sda.gofpatterns.creational.factoryMethod.creational.prototype;

public class PrototypeComputerBuilder {

    private static final Computer PROTOTYPE = createPrototype();

    private static Computer createPrototype() {
        System.out.println("Tworzenie komputera...");
        return new Computer("Intel", 104, 200000);
    }

    public Computer build() throws CloneNotSupportedException {
        return (Computer) PROTOTYPE.clone();

    }
}
