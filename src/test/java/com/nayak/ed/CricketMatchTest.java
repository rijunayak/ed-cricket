package com.nayak.ed;

import com.nayak.ed.stubs.StubBatsman;
import com.nayak.ed.stubs.StubBowler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CricketMatchTest {

    @Test
    void should_make_the_batsman_score_and_bowler_bowl_six_balls_if_no_wicket_taken_in_one_over_match() {
        StubBatsman batsman = new StubBatsman(1);
        StubBowler bowler = new StubBowler(13);

        CricketMatch cricketMatch = new CricketMatch(1, 12, batsman, bowler);

        cricketMatch.result();

        assertThat(batsman.getScoreCallCount(), is(6));
        assertThat(bowler.getBowlCallCount(), is(6));
    }

    @Test
    void should_make_the_batsman_score_and_bowler_bowl_three_balls_if_wicket_taken_in_one_over_match() {
        StubBatsman batsman = new StubBatsman(1);
        StubBowler bowler = new StubBowler(5);

        CricketMatch cricketMatch = new CricketMatch(1, 12, batsman, bowler);

        cricketMatch.result();

        assertThat(batsman.getScoreCallCount(), is(3));
        assertThat(bowler.getBowlCallCount(), is(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 9})
    void should_have_a_successful_result_if_batsman_scores_equal_or_more_than_runs_to_be_chased(int runsToBeChased) {
        StubBatsman batsman = new StubBatsman(1);
        StubBowler bowler = new StubBowler(9);
        CricketMatch cricketMatch = new CricketMatch(1, runsToBeChased, batsman, bowler);

        assertThat(cricketMatch.result(), is(StubBowler.BALLS_BOWLED
                + "\n" + StubBatsman.RUNS_SCORED
                + "\n" + "Batsman has won"));
    }

    @Test
    void should_not_have_a_successful_result_if_batsman_scores_less_than_runs_to_be_chased() {
        StubBatsman batsman = new StubBatsman(1);
        StubBowler bowler = new StubBowler(9);
        CricketMatch cricketMatch = new CricketMatch(1, 11, batsman, bowler);

        assertThat(cricketMatch.result(), is(StubBowler.BALLS_BOWLED
                + "\n" + StubBatsman.RUNS_SCORED
                + "\n" + "Batsman lost"));
    }
}
