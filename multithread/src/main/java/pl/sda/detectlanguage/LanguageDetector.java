package pl.sda.detectlanguage;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LanguageDetector {


    public static void main(String[] args) throws APIError, IOException {

        String language = detect("我買了雞蛋");

        System.out.println("Język to: " + language);

        String lines = readLinesFromFile("E:\\JAVA BIBLIOTEKA\\SDA\\ZADANIA\\artykuly\\chunichi.txt");

        System.out.println("Język z pliku to: " + detect(lines));

        List<String> filePaths = readAllFilePaths("E:\\JAVA BIBLIOTEKA\\SDA\\ZADANIA\\artykuly");

        detectLanguagesInFolder("E:\\JAVA BIBLIOTEKA\\SDA\\ZADANIA\\artykuly");


    }

    private static void detectLanguagesInFolder(String folderPath) throws IOException, APIError {

        List<String> filePaths = readAllFilePaths(folderPath);
        for (String filePath : filePaths) {
            String lines = readLinesFromFile(filePath);
            detect(lines);
            System.out.println(filePath +"  " + detect(lines));
        }
    }

    private static List<String> readAllFilePaths(String path) {

        List<String> filePaths = new ArrayList<>();
        File folder = new File(path);

//        for (File file : folder.listFiles()) {
//            if (file.isFile()) {
//                filePaths.add(file.getAbsolutePath());
//            }
//        }

        Arrays.stream(folder.listFiles())
                .filter(File::isFile)
                .forEach(t-> filePaths.add(t.getAbsolutePath()));

        return filePaths;
    }



    private static String readLinesFromFile(String filePatch) throws IOException {


        String lines = new String(Files.readAllBytes(Paths.get(filePatch)));

       // System.out.println(lines);

        return lines;

    }

    private static String detect(String words) throws APIError {

        DetectLanguage.apiKey = "a8f25b32b8fc9af6a91d3e843bf50427";


        List<Result> results = DetectLanguage.detect(words);

        Result result = results.get(0);

        return result.language;


    }


}
