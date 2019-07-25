package com.nayak.ed;

import com.nayak.ed.stubs.StubRunsGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BowlerTest {

    @Test
    void should_bowl_with_runs_given_by_runs_generator() {
        Bowler bowler = new Bowler(new StubRunsGenerator(3));

        assertThat(bowler.bowl(), is(3));
    }
}