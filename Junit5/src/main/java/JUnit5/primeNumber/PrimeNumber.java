package JUnit5.primeNumber;

import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {

        System.out.println("Podaj liczbę: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        if (number == 1 || number == 2) {

            System.out.println("Podana liczba jest liczba pierwszą");

        } else {

            for (int i = 2; i < number / 2; i++) {

                if (number % i != 0) {
                    System.out.println(" Podana liczba jest liczbą pierwszą");
                } else {
                    System.out.println("Podana liczba nie jest liczbą pierwszą");
                }

            }

        }
    }
}
