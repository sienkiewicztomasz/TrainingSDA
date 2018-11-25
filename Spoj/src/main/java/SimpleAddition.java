import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleAddition {



    public static void main(String[] args) {

        System.out.println("Enter a number from 0 to 100: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        System.out.println(n);

        int[] array = new int[n];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                int number = random1.nextInt(-100, 100);
                array[j] = number;
                System.out.print(array[j] + " ");
            }
            System.out.println();

            int sum = 0;

            for (int j : array) {

                sum += j;
            }

            System.out.println("Sum of numbers: " + sum);
        }
    }
}
