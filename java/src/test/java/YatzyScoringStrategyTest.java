import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class YatzyScoringStrategyTest {
    static Stream<Arguments> generateScore50() {
        return Stream.of(
            Arguments.of(List.of(4, 4, 4, 4, 4), 50),
            Arguments.of(List.of(6, 6, 6, 6, 6), 50),
            Arguments.of(List.of(6, 6, 6, 6, 3), 0)
        );
    }
    @ParameterizedTest
    @MethodSource("generateScore50")
    public void yatzy_scores_50(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new YatzyScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }
}