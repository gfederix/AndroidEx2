package com.company;

public class CardB implements Comparable< CardB > {
    private final int rank;
    private final int suit;
    static final int ACE = 14;
    static final int JOKER = 15;

    CardB(  int suit, int rank ){
        this.rank = rank;
        this.suit = suit;
    }
    public String getRank(){
        switch ( rank + 1 ){
            case (11): return "Jack";
            case (12): return "Queen";
            case (13): return "King";
            case (ACE): return "Ace";
            case (JOKER): return "Joker";
            default: return String.valueOf( rank );

        }
    }
    public String getSuit(){
        switch ( suit ) {
            case 0: return "Clubs";
            case 1: return "Diamonds";
            case 2: return "Spades";
            case 3: return "Hearts";
            default: return String.valueOf( suit );
        }
    }
    public String toString(){
        return getSuit() + " of " + getRank();
    }

    public boolean isValid(){
        return 0 <= suit && suit  <= 3 && 0 <=  rank && rank <= 15;
    }
    public boolean grater( CardB other ){
        return other.suit == suit && other.rank < rank;
    }

    public int compareTo( CardB other ){
        int suit_cmp = suit - other.suit;
        if ( suit_cmp == 0 ) {
            return  rank - other.rank;
        }
        return suit_cmp;
    }
    @Override
    public boolean equals( Object obj ){
        if ( this == obj )
            return true;
        if ( obj == null || getClass() != obj.getClass())
            return false;
        CardB other = (CardB) obj;
        if ( other.rank == rank && other.suit == suit  )
            return true;
        return false;
    }
    @Override
    public int  hashCode(){
        final int prime = 31;
        return prime * rank + suit;
    }

}
