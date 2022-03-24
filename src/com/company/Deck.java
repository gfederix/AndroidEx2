package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<CardB> cards;
    private Deck(){
        cards = new ArrayList<>();
    }

    public static Deck whthJockers(){
        Deck d = new Deck();
        for ( int suit = 0; suit < 4; suit++){
            for (int rank = 0; rank <= CardB.JOKER ; rank++ ){
                d.cards.add(new CardB(suit, rank));
            }
        }
        return d;
    }

    public static Deck whthoutJockers(){
        Deck d = new Deck();
        for ( int suit = 0; suit < 4; suit++){
            for (int rank = 0; rank <= CardB.ACE; rank++ ){
                d.cards.add(new CardB(suit, rank));
            }
        }
        return d;
    }
    public static CardB getRandom( Deck deck ){
        var max_index = deck.cards.size() - 1;
        return deck.cards.remove( (int) (max_index * Math.random()) );
    }

    public CardB getTop( ){
        return cards.remove( 0 );
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }

    public void add(CardB card ){
        if ( ! cards.contains(  card ) ){
            cards.add( card );
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void sort(){
        Collections.sort(cards);
    }

    public String toString(){
        String result = "********* Deck: **********\n";
        for ( var card: cards ){
            result = result + card.toString() + "\n";
        }
        result += "*********************************\n";
        return result;
    }
}
