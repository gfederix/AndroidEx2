package com.company;

public class CardB {
    private int rank;
    private int suit;
    CardB( int rank, int suit ){
        this.rank = rank;
        this.suit = suit;
    }
    int GetRank(){
        return rank;
    }
    int GetSuit(){
        return suit;
    }
}
