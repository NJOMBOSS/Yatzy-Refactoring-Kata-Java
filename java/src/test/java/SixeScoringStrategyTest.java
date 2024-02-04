import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SixeScoringStrategyTest {
    static Stream<Arguments> generateSix() {
        return Stream.of(
            Arguments.of(List.of(4, 4, 4, 5, 5), 0),
            Arguments.of(List.of(4, 4, 6, 5, 5), 6),
            Arguments.of(List.of(6, 5, 6, 6, 5), 18)
        );
    }

    @ParameterizedTest
    @MethodSource("generateSix")
    public void sixes_test(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new SixeScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}