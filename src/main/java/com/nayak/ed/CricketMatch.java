package com.nayak.ed;

public class CricketMatch {
    private static final int NUMBER_OF_BALLS_IN_OVER = 6;
    private final int runsToBeChased;
    private final Batsman batsman;

    public CricketMatch(int runsToBeChased, Batsman batsman) {
        this.runsToBeChased = runsToBeChased;
        this.batsman = batsman;
    }

    public String result() {
        for (int i = 0; i < NUMBER_OF_BALLS_IN_OVER; i++) {
            batsman.score();
        }
        String batsmanRuns = batsman.displayRunsScored();
        String outcome = batsman.runsScored() >= runsToBeChased ? "Batsman has won" : "Batsman lost";
        return batsmanRuns + "\n" + outcome;
    }
}
