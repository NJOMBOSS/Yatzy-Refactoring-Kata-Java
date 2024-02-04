import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallStraightScoringStrategyTest {
    static Stream<Arguments> generateSmall() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 4, 5), 15),
            Arguments.of(List.of(2, 3, 4, 5, 1), 15),
            Arguments.of(List.of(1, 2, 2, 4, 5), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateSmall")
    public void smallStraight(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new SmallStraightScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }


}