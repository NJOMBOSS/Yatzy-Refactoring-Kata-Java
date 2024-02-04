import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeStraightScoringStrategyTest {
    static Stream<Arguments> generateLarge() {
        return Stream.of(
            Arguments.of(List.of(6, 2, 3, 4, 5), 20),
            Arguments.of(List.of(2, 3, 4, 5, 6), 20),
            Arguments.of(List.of(1, 2, 2, 4, 5), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateLarge")
    public void largeStraight(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new LargeStraightScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }


}