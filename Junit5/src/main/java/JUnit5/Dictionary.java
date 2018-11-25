package JUnit5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {

        try {

            File file = new File("D:\\TrainingSDA\\Junit5\\src\\main\\java\\JUnit5\\dictionary.txt");
            Scanner scanner = new Scanner(System.in);
            scanner = new Scanner(file);

            ArrayList<String> list = new ArrayList<String>();
            while (scanner.hasNext()) {
                list.add(scanner.next());
                System.out.println(list);
            }
            scanner.close();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}



