package com.nayak.ed.stubs;

import com.nayak.ed.Bowler;

import java.util.List;

public class StubBowler extends Bowler {

    public static final String BALLS_BOWLED = "Balls Bowled";
    private final int seed;
    private int bowlCallCount;

    public StubBowler(int seed) {
        super(new StubRunsGenerator(0));
        this.seed = seed;
        bowlCallCount = 0;
    }

    @Override
    public int bowl() {
        int runs = seed - bowlCallCount;
        bowlCallCount++;
        return runs;
    }

    @Override
    public String displayBallsBowled(List<Integer> ballsBowled) {
        return BALLS_BOWLED;
    }

    public int getBowlCallCount() {
        return bowlCallCount;
    }
}
