import contract.ScoringStrategy;

import java.util.List;

public class TwoScoringStrategy implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filterAndSum(2, numbers);
    }
}
