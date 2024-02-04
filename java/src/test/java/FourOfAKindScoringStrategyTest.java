import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourOfAKindScoringStrategyTest {
    static Stream<Arguments> generateScoreFour() {
        return Stream.of(
            Arguments.of(List.of(3, 3, 3, 3, 5), 12),
            Arguments.of(List.of(5, 5, 5, 4, 5), 20)
        );
    }

    @ParameterizedTest
    @MethodSource("generateScoreFour")
    public void four_of_a_knd(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new FourOfAKindScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }


}