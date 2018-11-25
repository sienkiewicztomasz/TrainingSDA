package pl.sda.gofpatterns.creational.factoryMethod.creational.singleton;

public class DoubleCheckLazySingleton {
    private static volatile DoubleCheckLazySingleton INSTANCE;

    private DoubleCheckLazySingleton() {
    }

    public synchronized static DoubleCheckLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLazySingleton();
                }
            }

        }
        return INSTANCE;
    }
}
