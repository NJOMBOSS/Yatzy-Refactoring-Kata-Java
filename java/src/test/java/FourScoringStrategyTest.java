import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourScoringStrategyTest {
    static Stream<Arguments> generateFour() {
        return Stream.of(
            Arguments.of(List.of(4, 4, 4, 5, 5), 12),
            Arguments.of(List.of(4, 4, 5, 5, 5), 8),
            Arguments.of(List.of(4, 5, 5, 5, 5), 4)
        );
    }

    @ParameterizedTest
    @MethodSource("generateFour")
    public void fours_test(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new FourScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}