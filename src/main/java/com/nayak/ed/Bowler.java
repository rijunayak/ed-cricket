package com.nayak.ed;

public class Bowler {

    private final RunsGenerator runsGenerator;

    public Bowler(RunsGenerator runsGenerator) {
        this.runsGenerator = runsGenerator;
    }

    public int bowl() {
        return runsGenerator.runs();
    }
}
