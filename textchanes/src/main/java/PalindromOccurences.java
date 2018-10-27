import java.util.Scanner;

public class PalindromOccurences {



    public static void main(String[] args) {

        String text = getInputText("Podaj tekst: ");

        printAll(text);

    }



    private static void printAll(String text) {



        for (int i = 1; i < text.length(); i++) {

            char first = text.charAt(i-1);
            char second = text.charAt(i);
            if (first != second) continue;

            System.out.println(first + second);
            for (int j= i +1, k=i -1; j >= 0 && k < text.length(); j++, k--) {

                if (text.charAt(j) != text.charAt(k)) {

                    break;

                }

                System.out.println(text.substring(j, k + 1));

            }



        }

    }





    private static String getInputText(String message) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextLine();

    }

}