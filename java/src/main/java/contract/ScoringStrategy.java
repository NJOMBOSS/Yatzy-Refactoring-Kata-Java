package contract;

import java.util.List;

public interface ScoringStrategy {
    int score(List<Integer> numbers);
}
