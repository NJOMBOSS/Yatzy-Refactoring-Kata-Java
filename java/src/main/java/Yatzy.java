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


//    public static int smallStraight(int d1, int d2, int d3, int d4, int d5)
//    {
//        int[] tallies;
//        tallies = new int[6];
//        tallies[d1-1] += 1;
//        tallies[d2-1] += 1;
//        tallies[d3-1] += 1;
//        tallies[d4-1] += 1;
//        tallies[d5-1] += 1;
//        if (tallies[0] == 1 &&
//            tallies[1] == 1 &&
//            tallies[2] == 1 &&
//            tallies[3] == 1 &&
//            tallies[4] == 1)
//            return 15;
//        return 0;
//    }
//
//    public static int largeStraight(int d1, int d2, int d3, int d4, int d5)
//    {
//        int[] tallies;
//        tallies = new int[6];
//        tallies[d1-1] += 1;
//        tallies[d2-1] += 1;
//        tallies[d3-1] += 1;
//        tallies[d4-1] += 1;
//        tallies[d5-1] += 1;
//        if (tallies[1] == 1 &&
//            tallies[2] == 1 &&
//            tallies[3] == 1 &&
//            tallies[4] == 1
//            && tallies[5] == 1)
//            return 20;
//        return 0;
//    }
//
//    public static int fullHouse(int d1, int d2, int d3, int d4, int d5)
//    {
//        int[] tallies;
//        boolean _2 = false;
//        int i;
//        int _2_at = 0;
//        boolean _3 = false;
//        int _3_at = 0;
//
//
//
//
//        tallies = new int[6];
//        tallies[d1-1] += 1;
//        tallies[d2-1] += 1;
//        tallies[d3-1] += 1;
//        tallies[d4-1] += 1;
//        tallies[d5-1] += 1;
//
//        for (i = 0; i != 6; i += 1)
//            if (tallies[i] == 2) {
//                _2 = true;
//                _2_at = i+1;
//            }
//
//        for (i = 0; i != 6; i += 1)
//            if (tallies[i] == 3) {
//                _3 = true;
//                _3_at = i+1;
//            }
//
//        if (_2 && _3)
//            return _2_at * 2 + _3_at * 3;
//        else
//            return 0;
//    }
}



