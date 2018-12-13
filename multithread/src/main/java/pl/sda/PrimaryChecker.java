package pl.sda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimaryChecker {

    public static void main(String[] args) throws FileNotFoundException {

        readFile();


    }


    static void readFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("D:\\TrainingSDA\\numbers.txt"));
        Long primeCounter = 0L;
        while (scanner.hasNextLong()) {
            long numberFromfile = scanner.nextLong();
            boolean result = isPrime(numberFromfile);
            if (result ) {
                primeCounter++;
            }
        }
        System.out.println(primeCounter);
        scanner.close();


    }


    static boolean isPrime(long value) {


        if (value < 2)
            return false;

        if (value == 2)
            return true;

        for (int i =2; i < value; i++)
            if (value % i == 0)
                return false;


        return true;
    }
}






