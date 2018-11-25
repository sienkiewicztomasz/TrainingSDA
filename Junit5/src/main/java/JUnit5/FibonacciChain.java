package JUnit5;


public class FibonacciChain {


    Integer calculate(Integer n) {

        if (n < 0)
            throw new IllegalArgumentException();

        if (n < 2) return n;

        int a = calculate(n - 1) + calculate(n - 2);

        return a;
    }

}

