package pl.sda;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(value = Parameterized.class)

public class FibonacciChainTest {

    private FibonacciChain fibonacciChain;
    private Integer argument;
    private Integer expectedResult;

    public FibonacciChainTest(int argument, int expectedResult) {
        this.argument = argument;
        this.expectedResult = expectedResult;

    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @After
    public void After() {
        System.out.println("After");
    }

    @Test
    public void testFirstElement() {
        FibonacciChain fibonacciChain = new FibonacciChain();
        Integer result = fibonacciChain.calculate(1);
        Integer expectedResult = 1;
        Assert.assertEquals(expectedResult, result);
    }

    @Before
    public void before() {
        System.out.println("Before");
        fibonacciChain = new FibonacciChain();
    }

    @Test
    public void testFourthElement() {
        FibonacciChain fibonacciChain = new FibonacciChain();
        Integer result = fibonacciChain.calculate(4);
        Integer expectedResult = 3;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSeventhElement() {
        FibonacciChain fibonacciChain = new FibonacciChain();
        Integer result = fibonacciChain.calculate(7);
        Integer expectedResult = 13;
        Assert.assertEquals(expectedResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinusOneElement() {
        FibonacciChain fibonacciChain = new FibonacciChain();
        Integer result = fibonacciChain.calculate(-7);
        Integer expectedResult = 13;
        Assert.assertEquals(expectedResult, result);

    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {

        List<Integer[]> params = new ArrayList<>();

        addIntTableToParams(params,1, 1);
        addIntTableToParams(params,2, 1);
        addIntTableToParams(params,3, 2);
        addIntTableToParams(params,4, 3);
        addIntTableToParams(params,5, 5);
        addIntTableToParams(params,6, 8);

        return params;
    }

    private static void addIntTableToParams (List<Integer[]>params, int param1, int param2) {
        params.add(new Integer[]{param1, param2});
    }


    @Test
    public void shouldReturnExpectedResult () {

        Integer result = fibonacciChain.calculate(argument);
        Assert.assertEquals(result, expectedResult);

    }
}

