package JUnit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FibonacciChainTest {


    private FibonacciChain fibonacciChain;


    @BeforeAll

    static void beforeClass() {

        System.out.println("Before class");

    }


    @BeforeEach
    void setup() {

        System.out.println("Before");

        fibonacciChain = new FibonacciChain();

    }


    @Test
    void testFirstElementReturn1() {

        int result = fibonacciChain.calculate(1);

        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, result);



    }


    @Test
    void testFifthElementReturn5() {

        Integer result = fibonacciChain.calculate(5);

        Integer expectedResult = 5;

        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    @DisplayName("Given input seven and we expected result thirteen ")
    void testSeventhElementReturn7() {
    Integer result = fibonacciChain.calculate(7);
    Integer expectedResult = 13;
    Assertions.assertEquals(expectedResult, result);

    }

    @ParameterizedTest
    @MethodSource("NumberProvider")
    void testParametrized (Integer first, Integer expectedResult) {
        FibonacciChain fibonacciChain = new FibonacciChain();
        Integer result = fibonacciChain.calculate(first);
        Assertions.assertEquals(expectedResult, result);
    }

    static Stream <Arguments> NumberProvider() {
        return Stream.of(
                Arguments.arguments(5,5),
                Arguments.arguments(1,1),
                Arguments.arguments(4,3)
        );
    }


     @Test
     @DisplayName("Arrays for Hamcrest test")
     void testHamcrest () {

        FibonacciChain fibonacciChain = new FibonacciChain();

         Integer result = fibonacciChain.calculate(5);

         Integer expectedResult = 5;

         assertThat(result, is(expectedResult));

    }
}

