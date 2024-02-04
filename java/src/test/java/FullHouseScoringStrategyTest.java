import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullHouseScoringStrategyTest {
    static Stream<Arguments> generateFull() {
        return Stream.of(
            Arguments.of(List.of(6, 2, 2, 2, 6), 18),
            Arguments.of(List.of(2, 3, 4, 5, 6), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateFull")
    public void fullHouse(List<Integer> numbers, int expected) {
        Yatzy yatzy = new Yatzy(numbers, new FullHouseScoringStrategy());
        assertEquals(expected, yatzy.apply());
    }

}