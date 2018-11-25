package JUnit5;

public class Calculator {


    public Integer add(Integer first, Integer next) {

        int result;
        result = first + next;
        return result;
    }

    public Integer sub(int first, int next) {
        int result;
        result = first - next;
        return result;
    }

    public Integer multi(int first, int next) {
        int result = first * next;
        return result;
    }

    public Integer division(int first, int next) {
        if (next == 0) {
            throw new DivideByZeroDenominatorException();
        }
        int result = first / next;
        return result;
    }


}
