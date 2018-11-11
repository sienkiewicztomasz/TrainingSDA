import java.io.File;
import java.util.Scanner;

public class Flamaste {





    public static void main(String[] args) throws Exception {

        System.out.println("Enter the number of data sets(1-50): ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        File file = new File("D:\\TrainingSDA\\Spoj\\src\\main\\java\\Words");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            int result = 0;
            char[] array = line.toCharArray();
            for (int i=0; i<line.length(); i++)
                if (array[i] == array[i + 1]) {
                    System.out.println(array[i]);

                }



            }




        }
    }

