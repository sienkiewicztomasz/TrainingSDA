package JUnit5.dictionary;

import java.io.File;
import java.util.*;

public class Dictionary {


    public static void main(String[] args) {

        try {

            File file = new File("D:\\TrainingSDA\\Junit5\\src\\main\\java\\JUnit5\\dictionary\\dictionary.txt");
            Scanner scanner = new Scanner(file);

            List<Person> list = new ArrayList<>();
            while (scanner.hasNext()) {
                String FirstName = scanner.next();
                String LastName = scanner.next();
                list.add(new Person(FirstName, LastName));

            }
            scanner.close();

            Person.PersonComp Comparator = new Person.PersonComp();
            Comparator.add(0, new Person.LastName());
            Comparator.add(1, new Person.FirstName());

            System.out.println("Dane nieposortowane: ");
            System.out.println("                     ");
            for (Person person : list)
                System.out.println(person);

            System.out.println("                ");
            System.out.println("~~~~~~~~~~~~~~~~");
            System.out.println("                ");

            System.out.println("Dane posortowane: ");
            System.out.println("                  ");

            Collections.sort(list, Comparator);
            for (Person person : list)
                System.out.println(person);


        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}



