import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPairScoringStrategyTest {
    static Stream<Arguments> generateScorePairTwo() {
        return Stream.of(
            Arguments.of(List.of(3, 3, 5, 4, 5), 16),
            Arguments.of(List.of(3, 3, 5, 5, 5), 16)
        );
    }

    @ParameterizedTest
    @MethodSource("generateScorePairTwo")
    public void two_Pair(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new TwoPairScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }
}