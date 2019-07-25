package com.nayak.ed;

import com.nayak.ed.stubs.StubBatsman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CricketMatchTest {

    @Test
    void should_make_the_batsman_score_six_times() {
        StubBatsman batsman = new StubBatsman(0);
        CricketMatch cricketMatch = new CricketMatch(12, batsman);

        cricketMatch.result();

        assertThat(batsman.getScoreCallCount(), is(6));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13})
    void should_have_a_successful_result_if_batsman_scores_equal_or_more_than_runs_to_be_chased(int runsScored) {
        StubBatsman batsman = new StubBatsman(runsScored);
        CricketMatch cricketMatch = new CricketMatch(12, batsman);

        assertThat(cricketMatch.result(), is(batsman.displayRunsScored() + "\n" + "Batsman has won"));
    }

    @Test
    void should_not_have_a_successful_result_if_batsman_scores_less_than_runs_to_be_chased() {
        StubBatsman batsman = new StubBatsman(11);
        CricketMatch cricketMatch = new CricketMatch(12, batsman);

        assertThat(cricketMatch.result(), is(batsman.displayRunsScored() + "\n" + "Batsman lost"));
    }
}
