import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairScoringStrategyTest {
    static Stream<Arguments> generateScorePair() {
        return Stream.of(
            Arguments.of(List.of(3, 4, 3, 5, 6), 6),
            Arguments.of(List.of(5, 3, 3, 3, 5), 10),
            Arguments.of(List.of(5, 3, 6, 6, 5), 12),
            Arguments.of(List.of(1, 2, 3, 4, 5), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateScorePair")
    public void one_pair(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new PairScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}