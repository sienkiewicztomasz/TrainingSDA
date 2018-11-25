package pl.sda.gofpatterns.creational.factoryMethod.creational.singleton;

public class BillPughSingleton {

    private final String value;

    private BillPughSingleton() {
        this.value = "some value";
    }

    private static class Singleton {
        private static final BillPughSingleton INSTANCE =
                new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Singleton.INSTANCE;
    }
}
