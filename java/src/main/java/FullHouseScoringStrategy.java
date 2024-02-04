import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;
import java.util.stream.IntStream;

public class FullHouseScoringStrategy extends InitArrayAbstract implements ScoringStrategy {


    @Override
    public int score(List<Integer> numbers) {
        int[] tallies = this.initCountsArray(numbers);
        return IntStream.of(IntStream.range(0, 6)
                .filter(x -> tallies[x] == 2)
                .map(x -> x + 1)
                .reduce(Math::addExact)
                .orElse(0) * 2,
            IntStream.range(0, 6)
                .filter(x -> tallies[x] == 3)
                .map(x -> x + 1)
                .reduce(Math::addExact)
                .orElse(0) * 3).sum();
    }
}
