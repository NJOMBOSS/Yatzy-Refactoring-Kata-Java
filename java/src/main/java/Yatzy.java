import contract.ScoringStrategy;

import java.util.List;

public class Yatzy {
    private final List<Integer> dice;
    private final ScoringStrategy scoringStrategy;

    public Yatzy(List<Integer> numbers, ScoringStrategy scoringStrategy) {
        this.dice = List.copyOf(numbers);
        this.scoringStrategy = scoringStrategy;
    }

    public int apply() {
        return this.scoringStrategy.score(this.dice);
    }

}



