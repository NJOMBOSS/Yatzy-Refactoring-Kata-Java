import contract.ScoringStrategy;

import java.util.List;

public class FourScoringStrategy implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filterAndSum(4, numbers);
    }
}
