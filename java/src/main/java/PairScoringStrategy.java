import abstracts.InitArrayAbstract;
import contract.ScoringStrategy;

import java.util.List;

public class PairScoringStrategy extends InitArrayAbstract implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filteredValuesSumAndDouble(this.initCountsArray(numbers), 1, 1);
    }
}
