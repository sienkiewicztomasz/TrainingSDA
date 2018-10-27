import java.util.Scanner;

public class ArrayFibonacci {

    public static void main(String[] args) {

        System.out.println("Podaj długość wartości ciągu Fibonacciego: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fill(n);



    }

    public static void fill (int n) {

        long[] array = new long[n+2];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];

        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }


    }


}
