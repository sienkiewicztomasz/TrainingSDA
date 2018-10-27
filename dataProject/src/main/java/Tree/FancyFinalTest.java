package Tree;

public class FancyFinalTest extends FinalTest{

    public FancyFinalTest(String lastName) {
        super(lastName);
    }


    public static void main(String[] args) {

        FancyFinalTest object1 =new FancyFinalTest("Kasia");
        System.out.println(object1.testMethod());
        System.out.println(object1.testFinalMethod());
    }

}
