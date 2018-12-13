package pl.sda.thread;

public class SingleThreadRunnable {

    public static final long MAX_VALUE = 100_000_000_000L;

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.nanoTime();
                for (long l = 0; l < MAX_VALUE; l++) ;
                long endTime = System.nanoTime();
                System.out.println((double) (endTime - startTime) / 1_000_000_000);
            }
        });

        System.out.println("Zaczynam wątek");
        t.start();
        System.out.println("Kończę wątek");
        t.interrupt();

    }

}
