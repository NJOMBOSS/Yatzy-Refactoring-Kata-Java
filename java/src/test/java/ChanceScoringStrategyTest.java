import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceScoringStrategyTest {
    static Stream<Arguments> generateScoreChance() {
        return Stream.of(
            Arguments.of(List.of(2, 3, 4, 5, 1), 15),
            Arguments.of(List.of(3, 3, 4, 5, 1), 16)
        );
    }
    @ParameterizedTest
    @MethodSource("generateScoreChance")
    public void chance_scores_sum_of_all_dice(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new ChanceScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}