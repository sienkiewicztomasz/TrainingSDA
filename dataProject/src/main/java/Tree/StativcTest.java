package Tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StativcTest {

    public static final Integer VALUE = 5;

    String firstName;
    String lastName;
    Integer age;

    public void test()  {
        System.out.println("Test" + firstName);
    }

    public static void testStatic() {
        System.out.println("Test static" + VALUE);
    }



}
