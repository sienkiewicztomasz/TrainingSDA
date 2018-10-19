import java.util.Scanner;

public class Bills {

    public static void main(String[] args) {

        int change;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę do wydania reszty: ");
        change = (int) Math.round(scanner.nextDouble() * 100);

        int twoHundred = change / 20000;

        if (twoHundred > 0) {
            change = change % 20000;
            System.out.println(twoHundred + " banknotów 200 zł");
        }

        int oneHundred = change / 10000;

        if (oneHundred > 0) {
            change = change % 10000;
            System.out.println(oneHundred + " banknotów 100 zł");
        }

        int fifty = change / 5000;

        if (fifty > 0) {
            change = change % 5000;
            System.out.println(fifty + " banknotów 50 zł");
        }

        int twenty = change / 2000;

        if (twenty > 0) {
            change = change % 2000;
            System.out.println(twenty + " banknotów 20 zł");
        }

        int ten = change / 1000;

        if (ten > 0) {
            change = change % 1000;
            System.out.println(ten + " banknotów 10 zł");
        }

        int five = change / 500;

        if (five > 0) {
            change = change % 500;
            System.out.println(five + " monet 5 zł");
        }

        int two = change / 200;

        if (two > 0) {
            change = change % 200;
            System.out.println(two + " monet 2 zł");
        }

        int one = change / 100;

        if (one > 0) {
            change = change % 100;
            System.out.println(one + " monet 1 zł");
        }

        int fiftyCents = change / 50;

        if (fiftyCents > 0) {
            change = change % 50;
            System.out.println(fiftyCents + " monet 50 gr");
        }

        int twentyCents = change / 20;

        if (twentyCents > 0) {
            change = change % 20;
            System.out.println(twentyCents + " monet 20 gr");
        }


        int tenCents = change / 10;

        if (tenCents > 0) {
            change = change % 10;
            System.out.println(tenCents + " monet 10 gr");
        }

        int fiveCents = change / 5;

        if (fiveCents > 0) {
            change = change % 5;
            System.out.println(fiveCents + " monet 5 gr");
        }

        int twoCents = change / 2;

        if (twoCents > 0) {
            change = change % 2;
            System.out.println(twoCents + " monet 2 gr");
        }

        int oneCents = change / 1;

        if (oneCents > 0) {
            change = change % 1;
            System.out.println(oneCents + " monet 1 gr");
        }
    }
}
