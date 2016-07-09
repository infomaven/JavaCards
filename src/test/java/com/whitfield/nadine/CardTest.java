package com.whitfield.nadine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by nadine on 7/6/16.
 */
public class CardTest {

    @Test
    public void cardInitializesCorrectly_true() {
        Card testCard = new Card("Spades", "Ace");
        assertTrue(testCard instanceof Card);
    }

    @Test
    public void getSuit_ReturnsSpades_true() {
        Card testCard = new Card("Spades", "Ace");
        assertEquals( "Spades", testCard.getSuit());
    }

    @Test
    public void getValue_ReturnsAce_true() {
        Card testCard = new Card("Spades", "Ace");
        assertEquals( "Ace", testCard.getValue());
    }

    @Test
    public void getName_FormattedCorrectly_true() {
        Card testCard = new Card("Spades", "Ace");
        assertEquals( "Ace of Spades", testCard.getName());
    }

}
