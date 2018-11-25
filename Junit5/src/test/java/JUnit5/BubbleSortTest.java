package JUnit5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BubbleSortTest {


    private List<String> names;
    private final List<String> sortedNames = Arrays.asList("Justyna", "Monika", "Ola", "Ola");
    BubbleSort bubbleSort;

    @BeforeEach
    void initialize() {
        bubbleSort = new BubbleSort();
        names = Arrays.asList("Monika", "Ola", "Justyna", "Ola");

    }

    @Test
    void testListSize() {

        List<String> result = bubbleSort.sort(names);
        Assertions.assertThat(result)
                .hasSize(names.size())
                .isNotEmpty();

    }

    @Test
    void testSortHasCorrectOrder() {

        List<String> sortResult = bubbleSort.sort(names);
        List<String> sortedList = Arrays.asList("Monika", "Ola", "Justyna", "Ola");
        Collections.sort(sortedList);

        Assertions.assertThat(sortResult).isEqualTo(sortedNames);
    }

    @Test
    void testInputParameterNotChange() {

        List<String> copy = new ArrayList<>(names);
        bubbleSort.sort(names);
        List<String> result = bubbleSort.sort(names);
        Assertions.assertThat(names).isEqualTo(copy);
    }


}
