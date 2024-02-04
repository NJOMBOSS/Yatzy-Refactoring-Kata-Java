import contract.ScoringStrategy;

import java.util.List;

public class SixeScoringStrategy implements ScoringStrategy {

    @Override
    public int score(List<Integer> numbers) {
        return CommonMethod.filterAndSum(6, numbers);
    }
}
