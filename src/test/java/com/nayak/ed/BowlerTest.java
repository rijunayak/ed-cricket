package com.nayak.ed;

import com.nayak.ed.stubs.StubRunsGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BowlerTest {

    @Test
    void should_bowl_runs_from_runs_generated() {
        Bowler bowler = new Bowler(new StubRunsGenerator(1));

        assertThat(bowler.bowl(), is(1));
    }

    @Test
    void should_display_bowled_runs() {
        Bowler bowler = new Bowler(new StubRunsGenerator(3));

        List<Integer> ballsBowled = new ArrayList<>();
        ballsBowled.add(3);
        ballsBowled.add(4);
        ballsBowled.add(5);

        assertThat(bowler.displayBallsBowled(ballsBowled), is("Bowler: 3 4 5"));
    }
}
