package TestJvisualvm;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Scanner;

public class Reference {
    public static void main(String[] args) {

        SoftReference<Person> softReference = null;
        WeakReference<Person> weakReference = null;
        for (int i=0; i<3; i++) {

            softReference = new SoftReference<>(new Person("Ala", "Nowak", 20+i));
            weakReference = new WeakReference<>(new Person("Basia", "Janiak", 30+i));

            Person p = softReference.get();

        }

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("!!!: " + softReference.get());
        System.out.println("!!!: " + weakReference.get());
    }
}
