import java.util.Random;
import java.util.Scanner;

public class Nursery {

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

            int temp = 1;

            if (a == b) {
                temp = a;
                System.out.println(temp);
            } else {
                if (a > b) {
                    while (temp % b == 0) {
                        for (int j = 1; j < b + 1; j++) {
                            temp = j * a;
                        }
                    }
                    System.out.println(temp);
                } else {
                    while (temp % a == 0) {
                        for (int j = 1; j < a + 1; j++) {
                            temp = j * b;
                        }
                        System.out.println(temp);
                    }
                }
            }
        }
    }
}