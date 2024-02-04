import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonMethodTest {

    static Stream<Arguments> generateFilterAndSum() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 3, 4, 5), 6)
        );
    }

    @ParameterizedTest
    @MethodSource("generateFilterAndSum")
    public void testFilterAndSum(List<Integer> numbers, int expected) {
        int filterValue = 3;
        int result = CommonMethod.filterAndSum(filterValue, numbers);
        assertEquals(expected, result);
    }

    @Test
    void testFilteredValuesSumAndDouble() {
        // Données de test
        int[] counts = {1, 2, 3, 4, 5, 6};
        int maxSize = 3;
        int counter = 10;

        // Appel de la méthode
        int result = CommonMethod.filteredValuesSumAndDouble(counts, maxSize, counter);

        // Vérifications
        assertEquals((2 + 4 + 6 + counter) * 2, result);
    }

}