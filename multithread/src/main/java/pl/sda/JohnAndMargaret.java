package pl.sda;

public class JohnAndMargaret implements Runnable {

    @Override
    public void run () {}

    public static void main(String[] args) throws Exception {

        Thread john = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doWork("Jaś je śniadanie", 5000);
                    System.out.println("Jaś skończył śniadanie");
                    doWork("Jaś bierze prysznic", 3000);
                    System.out.println("Jaś skończył prysznic");
                    doWork("Jaś ubiera się", 1000);
                    System.out.println("Jaś ubrał się");
                    doWork("Jaś idzie na zakupy", 15000);
                    System.out.println("Jaś wrócił z zakupów");
                    doWork("Jaś gra na konsoli", 5000);
                    System.out.println("Jaś zakończył grę na konsoli");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread margaret = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    doWork("Małgosia poszła biegać", 6000);
                    System.out.println("Małgosia skończyła biegać");
                    doWork("Małgosia bierze prysznic", 2000);
                    System.out.println("Małgosia skończyła prysznic");
                    doWork("Małgosia je śniadanie", 1000);
                    System.out.println("Małgosia skończyła śniadanie");
                    doWork("Małgosia ubiera się", 1000);
                    System.out.println("Małgosia skończyła ubierać się");
                    doWork("Małgosia ma spotkanie z koleżanką", 25000);
                    System.out.println("Małgosia skończyła spotkanie z koleżanką");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        john.start();
        margaret.start();

        margaret.join();
        john.join();
        System.out.println("Koniec dnia");

    }

    private static void doWork(String s, int i) throws InterruptedException {
        System.out.println(s);
        Thread.sleep(i);
    }
}

