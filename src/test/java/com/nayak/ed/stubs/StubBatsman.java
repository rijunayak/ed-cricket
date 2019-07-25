package com.nayak.ed.stubs;

import com.nayak.ed.Batsman;

public class StubBatsman extends Batsman {

    private final int runsScored;
    private int scoreCallCount;

    public StubBatsman(int runsScored) {
        super(new StubRunsGenerator(0));
        this.runsScored = runsScored;
        scoreCallCount = 0;
    }

    @Override
    public void score() {
        scoreCallCount++;
    }

    @Override
    public int runsScored() {
        return runsScored;
    }

    public int getScoreCallCount() {
        return scoreCallCount;
    }
}
