package pl.sda.gofpatterns.creational.factoryMethod.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        value = "some value";
    }

    public String getValue() {
        return value;
    }

    private String value;
}
