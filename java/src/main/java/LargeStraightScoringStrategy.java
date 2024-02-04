import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;
import java.util.stream.IntStream;

public class LargeStraightScoringStrategy extends InitArrayAbstract implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return IntStream.of(this.initCountsArray(numbers))
            .skip(1)
            .allMatch(value -> value == 1) ? 20 : 0;
    }
}
