import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;

public class TwoPairScoringStrategy extends InitArrayAbstract implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filteredValuesSumAndDouble(this.initCountsArray(numbers), 2, 2);
    }
}
