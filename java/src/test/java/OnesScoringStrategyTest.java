import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OnesScoringStrategyTest {
    static Stream<Arguments> generateScoreOne() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 4, 5), 1),
            Arguments.of(List.of(1, 2, 1, 4, 5), 2),
            Arguments.of(List.of(1, 2, 1, 1, 1), 4)
        );
    }

    @ParameterizedTest
    @MethodSource("generateScoreOne")
    public void test_1s(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new OnesScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}