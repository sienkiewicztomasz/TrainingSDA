import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfArea {

    public static void main(String[] args) {

        File file = new File("d:/sumOfNumbers.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int sum = 0;

        while (scanner.nextLine() != null) {

            int number = scanner.nextInt();

            System.out.println(number);

            sum = sum + number;

            System.out.println(sum);


        }
    }
}
