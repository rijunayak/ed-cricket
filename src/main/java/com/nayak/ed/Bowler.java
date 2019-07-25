package com.nayak.ed;

import com.google.common.base.Joiner;

import java.util.List;

public class Bowler {

    private final RunsGenerator runsGenerator;

    public Bowler(RunsGenerator runsGenerator) {

        this.runsGenerator = runsGenerator;
    }

    public int bowl() {
        return runsGenerator.runs();
    }

    public String displayBallsBowled(List<Integer> ballsBowled) {
        return "Bowler: " + Joiner.on(' ').join(ballsBowled);
    }
}
