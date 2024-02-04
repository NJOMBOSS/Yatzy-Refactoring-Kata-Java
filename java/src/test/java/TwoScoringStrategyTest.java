import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoScoringStrategyTest {

    static Stream<Arguments> generateTwo() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 2, 6), 4),
            Arguments.of(List.of(2, 2, 2, 2, 2), 10)
        );
    }

    @ParameterizedTest
    @MethodSource("generateTwo")
    public void test_2s(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new TwoScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }


}