import contract.ScoringStrategy;

import java.util.List;

public class ThreeScoringStrategy implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filterAndSum(3, numbers);
    }
}
