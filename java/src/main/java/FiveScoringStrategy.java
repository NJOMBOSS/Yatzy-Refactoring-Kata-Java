import contract.ScoringStrategy;

import java.util.List;

public class FiveScoringStrategy implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filterAndSum(5, numbers);
    }
}
