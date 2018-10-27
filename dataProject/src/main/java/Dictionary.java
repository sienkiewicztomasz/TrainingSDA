import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Dictionary {

    private static final String FILE_PATH = "shortDictionary.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> dictionary = readWords();
        String word = getWord();
        System.out.println(translate(dictionary, word));
        printMap(dictionary);

    }




    private static String translate(Map<String, String> dictionary, String word) {

        return dictionary.get(word);




    }

    private static void printMap (Map<String, String> dictionary) {
        System.out.println(dictionary);
    }



    private static String getWord() {

        System.out.println("Podaj słowo do przetłumaczenia: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }


    private static Map<String, String> readWords() throws FileNotFoundException {

        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(new File(FILE_PATH));
        while (scanner.hasNextLine()) {

            String key = scanner.next();
            String value = scanner.next();

            dictionary.put(key,value);
            System.out.println(key);
        }

        scanner.close();
        return dictionary;



    }





}