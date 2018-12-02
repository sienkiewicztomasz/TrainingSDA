package pl.sda;

public class RunnableLambda {


    public static void main(String[] args) {

        System.out.println("Główny wątek");

        Runnable runnable = () -> {
            System.out.println("Lambda");
            Thread currentThread = Thread.currentThread();
            System.out.println("Nazwa wątku: " + currentThread.getName());
        };


        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread mainThread = Thread.currentThread();
        System.out.println("Wątek główny: " + mainThread.getName());

    }

}
