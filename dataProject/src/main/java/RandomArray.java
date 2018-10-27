import java.util.Random;
import java.util.Scanner;

public class RandomArray {


    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        stringOfNumbers(n);

    }

    public static void stringOfNumbers(int n) {

        int[] array = new int[n];

        Random random = new Random();

        for (int i=0; i<n; i++) {
            array [i] = random.nextInt(100);
            System.out.println(array[i]);
        }




        for (int i = 0; i < n; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println("Ciąg jest rosnący");
            }else{
                if (array[i] > array[i + 1]) {
                    System.out.println("Ciąg jest malejący");
                } else {
                    System.out.println("Ciąg nie jest rosnący, ani malejący");
                }
            }

        }
    }
}
