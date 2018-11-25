package pl.sda.gofpatterns.creational.factoryMethod.creational.singleton;

public class EagerSingleton {

    private final static EagerSingleton INSTANCE =
            new EagerSingleton();
    private String value;

    private EagerSingleton() {
        value = "some value";

    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "EagerSingleton{" +
                "value='" + value + '\'' +
                '}';
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
