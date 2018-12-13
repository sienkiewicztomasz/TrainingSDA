package pl.sda.NumbersFromString;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class NumbersFromString {

    public static void main(String[] args) {


        System.out.println("Podaj ciąg znaków: ");

        System.out.println("Suma liczb wynosi: " + sumNumbersFromString());

    }

    private static String readString() {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        return string;


    }

    private static int sumNumbersFromString() {

        String text = readString();

        int sum = 0;

        String[] numbers = (text.replaceAll("[a-zA-z]", " ")).split(" ");

        for (String i : numbers) {

            if (!i.equals(" ") && !i.isEmpty()) {

                sum += Integer.parseInt(i);

            }
        }
        return sum;
    }


//        int sum = 0;
//
//        for(int i = 0; i <text.length(); i++) {
//            if(Character.isDigit(text.charAt(i))) {
//
//                sum = sum + Character.getNumericValue(text.charAt(i));
//            }
//        }
//        return sum;

}

