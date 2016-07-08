package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A Deck contains 52 cards. No jokers are included. Aces are low.
 */
public class Deck  {
    private static final String[] SUITS = {"Spades","Clubs", "Hearts", "Diamonds" };
    private static final String[] VALUES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (String suit : SUITS ) {
            for (String value : VALUES ) {
                Card newcard = new Card( suit, value );
                cards.add( newcard );
            }
        }
    }

    // using List instead of AL for better flexibility
    public List<Card> getCards() {
        return cards;
    }


    // REFACTOR: modify method to use fixed suit sequence when sorting the card values
    public void sortCards() {
        Collections.sort( (List) cards);

    }

    public void shuffle() {
        Collections.shuffle( (List) cards );

    }
}
