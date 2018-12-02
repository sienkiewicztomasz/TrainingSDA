package pl.sda;

public class ThreadStopRequstedWithSynchronized {

    private static boolean stopRequsted = false;

    private static synchronized void requestStop() {
        stopRequsted = true;
    }

    private static synchronized boolean isStopRequsted() {
        return stopRequsted;
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!!!");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Zaczyna się wątek run");
                int i = 0;
                while (!isStopRequsted()) {
                    System.out.println(i);
                    i++;
                }
            }
        });
        System.out.println("Zaczynam wątek");
        t.start();
        System.out.println("Kończę wątek");
        Thread.sleep(1000);
        requestStop();

    }

}
