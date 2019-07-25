package com.nayak.ed;

public class CricketMatch {
    private final int runsToBeChased;
    private final Batsman batsman;

    public CricketMatch(int runsToBeChased, Batsman batsman) {
        this.runsToBeChased = runsToBeChased;
        this.batsman = batsman;
    }

    public String result() {
        for (int i = 0; i < 6; i++) {
            batsman.score();
        }
        String batsmanRuns = batsman.displayRunsScored();
        String outcome = batsman.runsScored() >= runsToBeChased ? "Batsman has won" : "Batsman lost";
        return batsmanRuns + "\n" + outcome;
    }
}
