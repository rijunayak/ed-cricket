package com.nayak.ed;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

class RandomRunsGeneratorTest {

    @Test
    void get_random_number_within_zero_and_six() {
        RandomRunsGenerator randomRunsGenerator = new RandomRunsGenerator();

        assertThat(randomRunsGenerator.runs(), greaterThanOrEqualTo(0));
        assertThat(randomRunsGenerator.runs(), lessThanOrEqualTo(6));
    }
}
