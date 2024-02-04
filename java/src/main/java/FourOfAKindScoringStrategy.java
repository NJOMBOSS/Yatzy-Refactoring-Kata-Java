import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;

public class FourOfAKindScoringStrategy extends InitArrayAbstract implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.findFirstIndexWithMinimumCount(this.initCountsArray(numbers), 4);
    }
}
