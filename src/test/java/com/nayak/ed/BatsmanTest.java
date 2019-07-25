package com.nayak.ed;

import com.nayak.ed.stubs.StubRunsGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BatsmanTest {

    @Test
    void should_score_runs_generated() {
        StubRunsGenerator stubRunsGenerator = new StubRunsGenerator(0);
        Batsman batsman = new Batsman(stubRunsGenerator);

        batsman.score();
        batsman.score();
        batsman.score();

        assertThat(batsman.runsScored(), is(3));
    }

    @Test
    void should_display_runs_scored() {
        StubRunsGenerator stubRunsGenerator = new StubRunsGenerator(0);
        Batsman batsman = new Batsman(stubRunsGenerator);

        batsman.score();
        batsman.score();
        batsman.score();

        assertThat(batsman.displayRunsScored(), is("Batsman: 0 1 2"));
    }
}