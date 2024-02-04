import contract.ScoringStrategy;

import java.util.List;

public class ChanceScoringStrategy implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return numbers.stream()
            .mapToInt(value -> value)
            .sum();
    }
}
