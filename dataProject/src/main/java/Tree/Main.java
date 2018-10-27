package Tree;

public class Main {
    public static void main(String[] args) {

        StativcTest object1 = new StativcTest();
        object1.setFirstName("Waldek");
        object1.setLastName("Nowak");
        object1.setAge(25);
        printText(object1);

        StativcTest object2 = new StativcTest();
        object2.setFirstName("Aleksandra");
        object2.setLastName("Kowalska");
        object2.setAge(30);
        printText(object2);

        object1.test();
        object2.test();

        StativcTest.testStatic();


    }
    public static void printText (StativcTest test) {
        System.out.println("Wynik object1 " + " " + test.getFirstName() + " age "
                + test.getAge() +
                " value: " + StativcTest.VALUE);
    }
}
