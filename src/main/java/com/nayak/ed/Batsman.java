package com.nayak.ed;

import com.google.common.base.Joiner;

import java.util.List;

public class Batsman {

    private final RunsGenerator runsGenerator;

    public Batsman(RunsGenerator runsGenerator) {
        this.runsGenerator = runsGenerator;
    }

    public int score() {
        return runsGenerator.runs();
    }

    public String displayRunsScored(List<Integer> runsScored) {
        return "Batsman: " + Joiner.on(' ').join(runsScored);
    }
}
