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

        List<Integer> surfaceAreas = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            String z = scanner.nextLine();
            z = z.replaceAll("x", " ");
            List<String> list = Arrays.asList(z.trim().split(" "));
            List<Integer> list1 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
            Collections.sort(list1);
            int surfaceArea = 3 * list1.get(0) * list1.get(1) + 2 * list1.get(0) * list1.get(2) + 2 * list1.get(1) * list1.get(2);
            //  System.out.println(surfaceArea);
            surfaceAreas.add(surfaceArea);

        }

        int sum = 0;

        for (int i = 0; i < surfaceAreas.size(); i++) {

            sum = sum + surfaceAreas.get(i);

        }

        System.out.println("Ilość papieru potrzebnego do owinięcia pudełek wynosi: " + sum + " dm2.");

    }
}
