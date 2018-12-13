package pl.sda.thread;

public class TreadStopRequestedWithVolatile {

        private static volatile boolean stopRequsted = false;

        public static void main(String[] args) throws Exception {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Zaczyna się wątek run");
                    int i = 0;
                    while (!stopRequsted) {
                        System.out.println(i);
                        i++;
                    }
                }
            });
            System.out.println("Zaczynam wątek");
            t.start();
            System.out.println("Kończę wątek");
            Thread.sleep(1000);
            stopRequsted = true;

        }

}



