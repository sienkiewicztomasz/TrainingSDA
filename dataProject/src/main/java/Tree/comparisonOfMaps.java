package Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class comparisonOfMaps {

    public static void main(String[] args) {

        System.out.println("Napisz kilka słów: ");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            String[] array = line.split(" ");

            for (String word : array) {

                int value = 0;

                for (int i = 0; i < word.length(); i++) {
                    value++;
                }

//        Map <String, Integer> wordsMap1 = new HashMap<>();
//        wordsMap1.put(word, value);
//        System.out.println(wordsMap1);}

                Map<String, Integer> wordsMap2 = new TreeMap<>();
                wordsMap2.put(word, value);
                System.out.println(wordsMap2);



                }

                }


            }
        }



