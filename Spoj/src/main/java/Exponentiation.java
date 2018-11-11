import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Exponentiation {

    public static void main(String[] args) {

        System.out.println("Enter the number (1-10)");
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        for (int i=0; i<D; i++) {
            Random random = new Random();
            int a = random.nextInt(999_999_999) + 1;
            Random random1 = new Random();
            System.out.println(a);
            int b = random1.nextInt(999_999_999) +1;
            System.out.println(b);
            String numberAsString = Integer.toString(a);
            String substring = numberAsString.substring(Math.max(numberAsString.length() - 1, 0));
         //   System.out.println(substring);
            int d = Integer.parseInt(substring);
         //   System.out.println(b%4);
            if (b%4 == 0) {
                System.out.println(substring);
            }else {
                int c = 1;
                int temp = b%4;
                while (temp>0) {
                    c*=d;
                    temp--;
                }
//                System.out.println(c);
                String numberAsString1 = Integer.toString(c);
                String substring1 = numberAsString1.substring(Math.max(numberAsString1.length() - 1, 0));
                System.out.println(substring1);
            }
        }
    }
}

