package Test;


import java.util.Scanner;



public class Pesel {



    private static final int[] MULTIPLIERS = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};



    public static void main(String[] args) {

        checkPesels();

    }



    private static void checkPesels() {

        Scanner scanner = new Scanner(System.in);

        int peselCount = scanner.nextInt();

        String[] pesels = new String[peselCount];



        for (int i = 0; i < peselCount; i++) {

            pesels[i] = scanner.next();

            System.out.println(checkPesel(pesels[i]));

        }

    }



    private static String checkPesel(String pesel) {

        int result = 0;

        for (int i = 0; i < pesel.length(); i++) {

            int digit = Integer.parseInt(String.valueOf(pesel.charAt(i)));

            result += digit * MULTIPLIERS[i];

        }



        if (result % 10 == 0 && result>0) {

            return "D";

        }

        return "N";

    }

}