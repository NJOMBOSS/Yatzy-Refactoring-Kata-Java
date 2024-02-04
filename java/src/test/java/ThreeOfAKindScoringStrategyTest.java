import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeOfAKindScoringStrategyTest {
    static Stream<Arguments> generateScoreThree() {
        return Stream.of(
            Arguments.of(List.of(3, 3, 3, 4, 5), 9),
            Arguments.of(List.of(5, 3, 5, 4, 5), 15),
            Arguments.of(List.of(3, 3, 3, 3, 5), 9)
        );
    }

    @ParameterizedTest
    @MethodSource("generateScoreThree")
    public void three_of_a_kind(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new ThreeOfAKindScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }


}