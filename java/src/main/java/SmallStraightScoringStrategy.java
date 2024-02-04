import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;
import java.util.stream.IntStream;

public class SmallStraightScoringStrategy extends InitArrayAbstract implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return IntStream.of(this.initCountsArray(numbers))
            .limit(5)
            .allMatch(value -> value == 1) ? 15 : 0;
    }
}
