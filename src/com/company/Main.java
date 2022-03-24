package com.company;
import com.company.CardC;
import com.company.CardB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        Ex2();
        Ex3();
        Ex4();
        Ex5();
    }

    static void Ex2(){
        CardC [] cards  = { new CardC(1, 4), new CardC(1, 2 ), new CardC(1)};
        for (var card: cards ) {
            System.out.println(card);
        }
        CardB [] cards3  = { new CardB(1, 4), new CardB(3, 13 )};
        for (var card: cards3 ) {
            System.out.println(card);
        }

    }

    static void Ex3(){
        System.out.println("-----EX3-----");
        System.out.println(new CardB(1 , 3).compareTo( new CardB( 1, 3)));
        System.out.println(new CardB(1 , 3).compareTo( new CardB( 1, 4)));
        System.out.println(new CardB(2 , 3).compareTo( new CardB( 1, 4)));
        System.out.println(new CardB(1 , 3).hashCode() ==  new CardB( 1, 3).hashCode());
        System.out.println(new CardB(1 , 3).hashCode() !=  new CardB( 0, 3).hashCode());
        System.out.println(new CardB(1 , 3).equals(new CardB(1, 3)));
        System.out.println(! new CardB(1 , 3).equals(new CardB(1, 1)));

    }
    static void Ex4(){
        System.out.println("-----EX4-----");
        var deck = Deck.whthoutJockers();
        for (var i=0; i < 4; i++ ){
            System.out.println( Deck.getRandom( deck ) );
        }
        for (var i=0; i < 2; i++ ){
            var card = Deck.getRandom( deck );
            System.out.println( "return:" + card );
            deck.add(card);
        }
        for (var i=0; i < 2; i++ ){
            var card = Deck.getRandom( deck );
            System.out.println( "double return:" + card );
            deck.add(card);
            deck.add(card);
        }
        System.out.println(deck);

        System.out.println( "\nShuffle\n" );
        deck.shuffle();
        System.out.println(deck);

        System.out.println( "\nSort\n" );
        deck.sort();
        System.out.println(deck);
        System.out.println( "\nGet All\n" );
        while (! deck.isEmpty() ){
            System.out.println("GetTop:" + deck.getTop());
        }
        System.out.println(deck);


    }

    static void Ex5(){
        System.out.println("-----EX5-----");
        var pic1 = new File("Flower", "jpg");
        var pic2 = new File("Cat", "jpg");

        var pic_folder = new Folder("Pictures", pic1, pic2);
        var doucment_folder = new Folder("Documents", pic_folder);
        var root = new Folder("/", doucment_folder);

        System.out.println( pic1.getPath());
        System.out.println( pic2.getExt());
        System.out.println( pic_folder.getPath());

    }
}
