package main;

/**
 * Created by nadine on 7/6/16.
 */
public class Main {
    public static void main( String[] args ) {
        System.out.println("Java deck of playing cards: ");
        Deck deck = new Deck();
        System.out.println("Raw deck created");
        for ( Card c : deck.getCards() ) {
            System.out.println( c.getName());
        }
        System.out.println("\n*************\n");

        deck.sortCards();
        System.out.println("Deck is now sorted: ");
        for ( Card c : deck.getCards() ) {
            System.out.println( c.getName());
        }
        System.out.println("\n*************\n");


        deck.shuffle();
        System.out.println("Deck is now shuffled: ");
        for ( Card c : deck.getCards() ) {
            System.out.println( c.getName());
        }
        System.out.println("\n*************\n");


    }
}
