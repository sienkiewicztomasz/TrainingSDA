package JUnit5;

import JUnit5.Calculator;
import JUnit5.DivideByZeroDenominatorException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Przed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Po wszystkim");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator();

    }

    @AfterEach
    public void cleanUpEach() {
        System.out.println("After Each cleanUpEach() method called");


    }

    @Test
    void testAdding() {
        int addResult = calculator.add(-13, -14);

        Assertions.assertEquals(addResult, -27);

    }

    @Test
    void testSubtraction() {
        int subResult = calculator.sub(15, 14);
        Assertions.assertEquals(subResult, 1);

    }

    @Test
    void testMultiplication() {
        int multiResult = calculator.multi(8, 7);
        Assertions.assertEquals(multiResult, 56);

    }

    @Test
    void testDivision() {
        int subResult = calculator.division(42, 2);
        Assertions.assertEquals(subResult, 21);

    }

    @Test
    void testDivision1() {
        int subResult = calculator.division(42, 4);
        Assertions.assertEquals(subResult, 21);

    }

    @Disabled
    @Test
    public void testDivision2() {
        int subResult = calculator.division(42, 8);
        Assertions.assertEquals(subResult, 21);

    }

    @ParameterizedTest
    @MethodSource("addNumberProvider")
    void testparametrizedAdd(Integer first, Integer next, Integer result) {
        Calculator calculator = new Calculator();
        Integer addResult = calculator.add(first, next);
        Assertions.assertEquals(result, addResult);
    }

    static Stream<Arguments> addNumberProvider() {
        return Stream.of(
                Arguments.arguments(5, 1, 6),
                Arguments.arguments(8, 12, 20),
                Arguments.arguments(7, 15, 22)
        );
    }

    @ParameterizedTest
    @MethodSource("subNumberProvider")
    void testParametrizedSub(Integer first, Integer next, Integer result) {
        Calculator calculator = new Calculator();
        Integer subResult = calculator.sub(first, next);
        Assertions.assertEquals(result, subResult);

    }

    static Stream<Arguments> subNumberProvider() {
        return Stream.of(
                Arguments.arguments(5, 1, 4),
                Arguments.arguments(8, 12, -4),
                Arguments.arguments(7, 15, -8)
        );
    }

    @ParameterizedTest
    @MethodSource("multiNumberProvider")
    void testParametrizedMulti(Integer first, Integer next, Integer result) {
        Calculator calculator = new Calculator();
        Integer multiResult = calculator.multi(first, next);
        Assertions.assertEquals(result, multiResult);

    }

    static Stream<Arguments> multiNumberProvider() {
        return Stream.of(
                Arguments.arguments(5, 1, 5),
                Arguments.arguments(8, 12, 30),
                Arguments.arguments(7, 15, -105)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionNumberProvider")
    void testParametrizedDivision(Integer first, Integer next, Integer result) {
        Calculator calculator = new Calculator();
        Integer divisionResult = calculator.division(first, next);
        Assertions.assertEquals(result, divisionResult);
    }

    static Stream<Arguments> divisionNumberProvider() {
        return Stream.of(
                Arguments.arguments(580, 58, 10),
                Arguments.arguments(8, 4, 2),
                Arguments.arguments(7, 7, 2)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 3, 2})
    void testValueSource(Integer number) {
        Calculator calculator = new Calculator();
        Integer addResult = calculator.add(number, number);
        Integer result = 2 * number;
        Assertions.assertEquals(addResult, result);
    }

    @Test
    public void testShoudThrowDivideByZeroException() {
        Calculator calculator = new Calculator();

        Assertions.assertThrows(DivideByZeroDenominatorException.class, () -> calculator.division(1, 0));
      //  Assertions.assertDoesNotThrow(() -> calculator.division(9, 1));

    }
}
