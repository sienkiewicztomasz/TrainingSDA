package JUnit5.dictionary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

    private String FirstName;
    private String LastName;

    public Person(String FirstName, String LastName) {
        this.LastName = LastName;
        this.FirstName = FirstName;
    }


    public String toString() {
        return (FirstName + " " + LastName);
    }

    public static class PersonComp implements Comparator<Person> {

        private List<Comparator<Person>> comparatorArrayList = new ArrayList<Comparator<Person>>();
        private int result = 0;

        public void add(int i, Comparator<Person> arg1) {
            comparatorArrayList.add(i, arg1);
        }

        @Override
        public int compare(Person o1, Person o2) {
            for (int i = 0; i < comparatorArrayList.size(); i++) {
                result = comparatorArrayList.get(i).compare(o1, o2);
                if (result != 0) return result;
            }
            return 0;
        }

    }

    public static class LastName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.LastName.compareToIgnoreCase(o2.LastName);
        }

    }

    public static class FirstName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.FirstName.compareToIgnoreCase(o2.FirstName);
        }

    }


}

