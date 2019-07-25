package com.nayak.ed.stubs;

import com.nayak.ed.Batsman;

import java.util.List;

public class StubBatsman extends Batsman {

    private final int seed;
    public static final String RUNS_SCORED = "Runs Scored";
    private int scoreCallCount;

    public StubBatsman(int seed) {
        super(new StubRunsGenerator(0));
        this.seed = seed;
        scoreCallCount = 0;
    }

    @Override
    public int score() {
        return seed + scoreCallCount++;
    }

    @Override
    public String displayRunsScored(List<Integer> runsScored) {
        return RUNS_SCORED;
    }

    public int getScoreCallCount() {
        return scoreCallCount;
    }
}
