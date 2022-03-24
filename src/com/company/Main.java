package com.company;
import com.company.CardC;
import com.company.CardB;

public class Main {

    public static void main(String[] args) {
        CardC [] cards  = { new CardC(1, 4), new CardC(1, 2 ), new CardC(1)};
        for (var card: cards ) {
            System.out.println(card);
        }
        CardB [] cards3  = { new CardB(1, 4), new CardB(3, 13 )};
        for (var card: cards3 ) {
            System.out.println(card);
        }
        System.out.println(new CardB(1 , 3).compare( new CardB( 1, 3)));
        System.out.println(new CardB(1 , 3).compare( new CardB( 1, 4)));
        System.out.println(new CardB(2 , 3).compare( new CardB( 1, 4)));
        System.out.println(new CardB(1 , 3).hashCode() ==  new CardB( 1, 3).hashCode());
        System.out.println(new CardB(1 , 3).hashCode() !=  new CardB( 0, 3).hashCode());
        System.out.println(new CardB(1 , 3).equals(new CardB(1, 3)));
        System.out.println(! new CardB(1 , 3).equals(new CardB(1, 1)));


    }
}
