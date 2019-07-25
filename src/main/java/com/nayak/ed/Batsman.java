package com.nayak.ed;

import com.google.common.base.Joiner;

import java.util.ArrayList;

public class Batsman {

    private final RunsGenerator runsGenerator;
    private final ArrayList<Integer> runsScored;

    public Batsman(RunsGenerator runsGenerator) {
        this.runsGenerator = runsGenerator;
        this.runsScored = new ArrayList<>();
    }

    public void score() {
        runsScored.add(runsGenerator.runs());
    }

    public int runsScored() {
        return runsScored.stream().mapToInt(Integer::intValue).sum();
    }

    public String displayRunsScored() {
        return "Batsman: " + Joiner.on(' ').join(runsScored);
    }
}
