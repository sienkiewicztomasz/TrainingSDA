package Test;

import java.util.Scanner;

public class NumberOfPesel {

    public static void main(String[] args) {

        System.out.println("Podaj 1 numer pesel: ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        System.out.println("Podaj 2 numer pesel: ");
        Scanner scanner1 = new Scanner(System.in);
        int x2 = scanner1.nextInt();
        System.out.println("Podaj 3 numer pesel: ");
        Scanner scanner2 = new Scanner(System.in);
        int x3 = scanner2.nextInt();
        System.out.println("Podaj 4 numer pesel: ");
        Scanner scanner3 = new Scanner(System.in);
        int x4 = scanner3.nextInt();
        System.out.println("Podaj 5 numer pesel: ");
        Scanner scanner4 = new Scanner(System.in);
        int x5 = scanner4.nextInt();
        System.out.println("Podaj 6 numer pesel: ");
        Scanner scanner5 = new Scanner(System.in);
        int x6 = scanner5.nextInt();
        System.out.println("Podaj 7 numer pesel: ");
        Scanner scanner6 = new Scanner(System.in);
        int x7 = scanner6.nextInt();
        System.out.println("Podaj 8 numer pesel: ");
        Scanner scanner7 = new Scanner(System.in);
        int x8 = scanner7.nextInt();
        System.out.println("Podaj 9 numer pesel: ");
        Scanner scanner8 = new Scanner(System.in);
        int x9 = scanner8.nextInt();
        System.out.println("Podaj 10 numer pesel: ");
        Scanner scanner9 = new Scanner(System.in);
        int x10 = scanner9.nextInt();
        System.out.println("Podaj 11 numer pesel: ");
        Scanner scanner10 = new Scanner(System.in);
        int x11 = scanner10.nextInt();


        int testPesel = x1 + 3*x2 + 7*x3 + 9*x4 + x5 + 3*x6 + 7*x7 + 9*x8 + x9 + 3*x10 + x11 ;

        if (testPesel%10 == 0) {
            System.out.println("Pesel jest prawidłowy");
        } else {
            System.out.println("Pesel jest nieprawidłowy"
            );
        }




    }


}







