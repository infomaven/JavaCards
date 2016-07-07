package main;

/**
 * Created by nadine on 7/6/16.
 */
public class Card {
    String cardValue;
    String cardSuit;

    public Card( String suit, String value ) {
        cardSuit = suit;
        cardValue = value;
    }

    public String getValue() {
        return cardValue;
    }

    public String getSuit() {
        return cardSuit;
    }

    public String getName() {
        return String.format("%s of %s", cardValue, cardSuit );
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 17 + this.cardSuit.hashCode();
        hashCode = hashCode * 31 + this.cardValue.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals( Object other ) {

        if (!(other instanceof Card)) {
            return false;
        }
        Card that = (Card) other;
        return this.cardSuit.equals( that.cardSuit)&& this.cardValue.equals( that.cardValue);
    }


}
