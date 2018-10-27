import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Words {

    public static final String FILE_PATH = "mapWords.txt";


    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(FILE_PATH));
        while (scanner.hasNextLine()) {
            Map<String, Integer> wordsMap = new HashMap<>();
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            for (String word : array) {
                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } else {
                    wordsMap.put(word, 1);
                }
            }
            System.out.println(wordsMap);
        }
    }
}
