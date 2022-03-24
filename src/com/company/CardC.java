package com.company;

public class CardC {
    private int suit;
    private int rank;
    static int maxRank[] = { 0, 0, 0, 0};

    CardC(int suit){
        this.suit = suit;
        rank = maxRank[suit]++;
    }

    CardC(int suit, int rank ){
        this.suit = suit;
        this.rank = rank;
        maxRank[suit] = Math.max( maxRank[suit], rank + 1 );
    }

    public int GetRank(){
        return rank;
    }

    public int GetSuit(){
        return suit;
    }

    public String toString() {
        return "suit: " + suit + " rank: " + rank;
    }
}
