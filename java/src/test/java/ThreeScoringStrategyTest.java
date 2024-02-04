import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeScoringStrategyTest {
    static Stream<Arguments> generateThree() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 2, 3), 6),
            Arguments.of(List.of(2, 3, 3, 3, 3), 12)
        );
    }

    @ParameterizedTest
    @MethodSource("generateThree")
    public void test_threes(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new ThreeScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}