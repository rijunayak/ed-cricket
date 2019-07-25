package com.nayak.ed;

public class Program {

    public static void main(String[] args) {
        RandomRunsGenerator randomRunsGenerator = new RandomRunsGenerator();
        Batsman batsman = new Batsman(randomRunsGenerator);
        Bowler bowler = new Bowler(randomRunsGenerator);
        CricketMatch cricketMatch = new CricketMatch(2, 12, batsman, bowler);
        System.out.println(cricketMatch.result());
    }
}
