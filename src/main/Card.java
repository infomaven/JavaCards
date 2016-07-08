package main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nadine on 7/6/16.
 */
public class Card implements Comparable<Card> {
    String cardValue;
    String cardSuit;

    // "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    private static final Map<String,Integer> rankMap = new HashMap<String,Integer>();
    static {
        rankMap.put("Ace", 1);
        rankMap.put("2", 2);
        rankMap.put("3", 3);
        rankMap.put("4",4);
        rankMap.put("5",5);
        rankMap.put("6",6);
        rankMap.put("7",7);
        rankMap.put("8",8);
        rankMap.put("9",9);
        rankMap.put("10",10);
        rankMap.put("Jack",11);
        rankMap.put("Queen",12);
        rankMap.put("King",13);
    }

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

    public int getRank( String rankName ) {
        int rank= rankMap.get(rankName);

        return rank;
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

    @Override
    public int compareTo(Card comparedCard) {

        int comparedValue = ((Card) comparedCard).getRank( comparedCard.getValue() );

        // Comparable supports just one sort order at a time. In this case we are using ASC rank value
        return this.getRank( this.getValue()) - comparedValue;
    }
}
