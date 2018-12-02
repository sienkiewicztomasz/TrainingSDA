package JUnit5.dictionary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DictionaryTest {

    private List<String> names;
    private final List<String> sortedNames = Arrays.asList("Tymon Adamowicz","Jan Nowak","Kinga Rusin","Piotr Wolak");
    Dictionary dictionary;


    @BeforeEach
    void initialize () {
        dictionary = new Dictionary();
        names = Arrays.asList("Jan Nowak", "Piotr Wolak", "Kinga Rusin", "Tymon Adamowicz");

    }


    @Test
    void testSortHasCorrectOrder() {

     //   ArrayList<String> sortResult = dictionary.;


    }
}
