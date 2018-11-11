import java.util.Random;
import java.util.Scanner;


public class TwoDigitOfStrong {


    public static void main(String[] args) {

        System.out.println("Enter the number of tests (1-30): ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int number = random.nextInt(1_000_000_000);
            System.out.println(number);

            if (number > 9) {
                System.out.println("00");
            } else {
                if (number <= 1) {
                    System.out.println("01");
                } else {
                    if (number == 2 || number == 3) {
                        int strong = 1;
                        for (int j = 2; j < number + 1; j++) {
                            strong *= j;
                        }

                        String numberAsString = Integer.toString(strong);
                        String substring = numberAsString.substring(Math.max(numberAsString.length() - 2, 0));
                        System.out.println("0" + substring);
                    } else {
                        if (number > 3 && number < 10) {
                            int strong = 1;
                            for (int j = 2; j < number + 1; j++) {
                                strong *= j;
                            }

                            String numberAsString = Integer.toString(strong);
                            String substring = numberAsString.substring(Math.max(numberAsString.length() - 2, 0));
                            System.out.println(substring);
                        }
                    }
                }
            }
        }
    }
}

