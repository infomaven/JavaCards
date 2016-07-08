package main;

import java.util.ArrayList;

/**
 * Created by nadine on 7/6/16.
 */
public class Deck {
    private static final String[] SUITS = {"Spades","Clubs", "Hearts", "Diamonds" };
    private static final String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (String suit : SUITS ) {
            for (String value : VALUES ) {
                Card newcard = new Card( suit, value );
                cards.add( newcard );
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void sortCards() {

    }
}
