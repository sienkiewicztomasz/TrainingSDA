package TestJvisualvm;

import Test.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int counter = 5;
        List<Person> person = new ArrayList<>();



        for (int i=0; i<counter; i++) {
            Person p = new Person("Jan", "Kowalski",20);
            person.add(p);
            String s = scanner.nextLine();
        }
        System.out.println(person);
    }
}
