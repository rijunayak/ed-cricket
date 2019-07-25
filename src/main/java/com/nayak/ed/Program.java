package com.nayak.ed;

public class Program {

    public static void main(String[] args) {
        RandomRunsGenerator randomRunsGenerator = new RandomRunsGenerator();
        Batsman batsman = new Batsman(randomRunsGenerator);
        CricketMatch cricketMatch = new CricketMatch(12, batsman);
        System.out.println(cricketMatch.result());
    }
}
