package com.nayak.ed;

import java.util.Random;

public class RandomRunsGenerator implements RunsGenerator {

    @Override
    public int runs() {
        Random random = new Random();
        return random.nextInt(7);
    }
}
