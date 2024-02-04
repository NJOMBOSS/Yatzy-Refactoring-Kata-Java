import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;
import java.util.stream.IntStream;

public class YatzyScoringStrategy extends InitArrayAbstract implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return IntStream.of(this.initCountsArray(numbers))
            .filter(count -> count == 5)
            .map(ignored -> 50)
            .findFirst()
            .orElse(0);
    }
}
