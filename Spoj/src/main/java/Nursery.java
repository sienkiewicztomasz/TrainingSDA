import java.util.Random;
import java.util.Scanner;

public class Nursery {

    public static int greatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number (1-10): ");
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        for (int i = 0; i < D; i++) {
            Random random = new Random();
            int a = random.nextInt(9) + 1;
            System.out.println(a);
            Random random1 = new Random();
            int b = random1.nextInt(29) + 1;
            System.out.println(b);

            int NWW = a * b / greatestCommonDivisor(a, b);

            System.out.println("The nursery needs " + NWW + " candy.");
        }
    }
}
