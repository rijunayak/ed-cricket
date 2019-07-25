package com.nayak.ed;

import com.nayak.ed.stubs.StubRunsGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BatsmanTest {

    @Test
    void should_score_runs_generated() {
        StubRunsGenerator stubRunsGenerator = new StubRunsGenerator(1);
        Batsman batsman = new Batsman(stubRunsGenerator);

        assertThat(batsman.score(), is(1));
    }

    @Test
    void should_display_runs_scored() {
        Batsman batsman = new Batsman(new StubRunsGenerator(0));

        List<Integer> runsScored = new ArrayList<>();
        runsScored.add(0);
        runsScored.add(1);
        runsScored.add(2);

        assertThat(batsman.displayRunsScored(runsScored), is("Batsman: 0 1 2"));
    }
}
