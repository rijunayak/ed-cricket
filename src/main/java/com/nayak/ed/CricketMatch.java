package com.nayak.ed;

import java.util.ArrayList;
import java.util.List;

public class CricketMatch {
    private static final int NUMBER_OF_BALLS_IN_OVER = 6;

    private final int oversToBowl;
    private final int runsToBeChased;
    private final Batsman batsman;
    private final Bowler bowler;
    private final ArrayList<Integer> runsScored;
    private final ArrayList<Integer> ballsBowled;

    public CricketMatch(int oversToBowl, int runsToBeChased, Batsman batsman, Bowler bowler) {
        this.oversToBowl = oversToBowl;
        this.runsToBeChased = runsToBeChased;
        this.batsman = batsman;
        this.bowler = bowler;
        runsScored = new ArrayList<>();
        ballsBowled = new ArrayList<>();
    }

    public String result() {
        for (int i = 0; i < oversToBowl * NUMBER_OF_BALLS_IN_OVER; i++) {
            int runs = batsman.score();
            int ball = bowler.bowl();
            if (runs == ball)
                break;
            runsScored.add(runs);
            ballsBowled.add(ball);
        }

        String batsmanRuns = batsman.displayRunsScored(runsScored);
        String bowlerBalls = bowler.displayBallsBowled(ballsBowled);
        String outcome = totalRuns(runsScored) >= runsToBeChased ? "Batsman has won" : "Batsman lost";
        return bowlerBalls + "\n" + batsmanRuns + "\n" + outcome;
    }

    private static int totalRuns(List<Integer> runsScored) {
        return runsScored.stream().mapToInt(Integer::intValue).sum();
    }
}
