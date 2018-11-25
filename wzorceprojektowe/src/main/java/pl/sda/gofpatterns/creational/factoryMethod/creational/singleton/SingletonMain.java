package pl.sda.gofpatterns.creational.factoryMethod.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.getValue();
    }
}
