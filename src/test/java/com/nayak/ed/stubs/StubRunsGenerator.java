package com.nayak.ed.stubs;

import com.nayak.ed.RunsGenerator;

public class StubRunsGenerator implements RunsGenerator {
    private int seed;
    private int count;

    public StubRunsGenerator(int seed) {
        this.seed = seed;
        count = 0;
    }

    @Override
    public int runs() {
        return seed + count++;
    }
}
