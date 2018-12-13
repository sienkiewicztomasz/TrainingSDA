package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryCheckerTest {

    @Test
    void testisPrime() {

        PrimaryChecker checker = new PrimaryChecker();

        boolean result = checker.isPrime(6);

        Assertions.assertEquals(result, false);


    }

    @ParameterizedTest
    @MethodSource(value = "getPrimeNumbers")
    void testIsPrimeParameterized(long number, boolean expectedResult){
        PrimaryChecker checker = new PrimaryChecker();

        boolean result = checker.isPrime(number);

        Assertions.assertEquals(result,expectedResult);

    }

    static Stream<Arguments> getPrimeNumbers () {

        return Stream.of(
                Arguments.arguments(2L,true),
                Arguments.arguments(3L,true),
                Arguments.arguments(5L,true),
                Arguments.arguments(7l,true),
                Arguments.arguments(10l,false)
        );


    }
}