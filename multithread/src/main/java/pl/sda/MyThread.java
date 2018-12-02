package pl.sda;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello I'm thread");
    }


    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        System.out.println("Hello world");
    }
}
