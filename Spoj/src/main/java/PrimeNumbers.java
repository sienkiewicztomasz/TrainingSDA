import java.util.Random;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Enter the number of tests: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            boolean isPrime = true;
            Random random = new Random();
            int number = random.nextInt(9999)+1;
            System.out.println(number);
            for (int j=2; j<number/2; j++) {
                if (number%j==0) {

                    isPrime = false;
                    break;

                }
            }
            if(isPrime)
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }
}
