package com.company;
import com.company.CardC;

public class Main {

    public static void main(String[] args) {
        CardC [] cards  = { new CardC(1, 4), new CardC(1, 2 ), new CardC(1)};
        for (var card: cards ) {
            System.out.println(card);
        }
    }
}
