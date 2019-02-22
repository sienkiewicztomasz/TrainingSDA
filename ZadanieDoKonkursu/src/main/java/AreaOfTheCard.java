import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class AreaOfTheCard {

    public static void main(String[] args) {

        File file = new File("d:/numbers.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {


            String z = scanner.nextLine();
            z = z.replaceAll("x", " ");
            List<String> list = Arrays.asList(z.trim().split(" "));
            List<Integer> list1 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
            Collections.sort(list1);
            int sum = 3 * list1.get(0) * list1.get(1) + 2 * list1.get(0) * list1.get(2) + 2 * list1.get(1) * list1.get(2);
            System.out.println(sum);


        }
    }
}
