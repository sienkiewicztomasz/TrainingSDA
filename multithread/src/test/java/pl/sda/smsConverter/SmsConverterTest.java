package pl.sda.smsConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmsConverterTest {

    @Test
    void testConvert() {

        String a = "Ala ma kota";
        String b = "AlaMaKota";
        SmsConverter converter = new SmsConverter();
        Assertions.assertEquals(converter.convert(a),b);

    }

    @ParameterizedTest
    @MethodSource("getData")
    public void testParameterizedConvert (String message, String expectedMessage) {

        SmsConverter converter = new SmsConverter();
        String result = converter.convert(message);
        Assertions.assertEquals(expectedMessage,result);

    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of("",""),
                Arguments.of("Tomek","Tomek"),
                Arguments.of("Przyjde jutro","PrzyjdeJutro"),
                Arguments.of("Przyszła Ola do przedszkola","PrzyszłaOlaDoPrzedszkola")
                );
    }
}