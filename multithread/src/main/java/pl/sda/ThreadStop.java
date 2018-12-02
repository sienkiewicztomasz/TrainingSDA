package pl.sda;

public class ThreadStop {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;

                while (true){
                    System.out.println(i);
                    i++;
                }



            }
        });

        t.start();
        Thread.sleep(7000);
        t.stop();
    }
}
