package com.whitfield.nadine;

import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Utility method. Returns TRUE if 2 Lists have matching elements
 */
public class DeckTest {
    private boolean verifyListMatch(List<Card> prevList, List<Card> modList) {
        if (prevList.size() == modList.size()) {
            for (Card p : prevList) {
                for (Card m : modList) {
                    if ( p.getSuit().equals(m.getSuit()) && p.getValue().equals(m.getValue()))
                        return true;
                }
            }
        }
    else {
        return false;
    }
    return false;
}

    @Test
    public void deck_initializesCorrectly() {
        Deck testDeck = new Deck();
        assertEquals( true, testDeck instanceof Deck);

    }

    @Test
    public void getCards_instanceContainsInitializedList_true() {
        Deck testDeck = new Deck();
        assertEquals( true, testDeck.getCards() instanceof ArrayList);
    }

    @Test
    public void getCards_initializesWithCorrectNumberOfCards_52() {
        Deck testDeck = new Deck();
        assertEquals( 52, testDeck.getCards().size() );
    }

    @Test
    public void getCards_firstCardFromDeck_defaultCard() {
        Deck testDeck = new Deck();
        Card actual = testDeck.getCards().get(0);

        assertEquals( "Ace of Spades", actual.getName() );
    }

@Test
    public void getCards_noDuplicatesInDeck_true() {
    Deck testDeck = new Deck();
    int setSize = 0;
    HashSet<Card> cardSet = new HashSet<Card>( testDeck.getCards());
    setSize = cardSet.size();

    assertEquals(testDeck.getCards().size(), setSize);
}

    @Test
    public void getCards_sortIsByAscValue_true() {
        Deck testDeck = new Deck();

        testDeck.sortCards();
        // taking a "slice" from AL in Java returns List type, so we must adapt
        List<Card> sample = testDeck.getCards().subList( 0, 4);
        List<String> foundFirstFour = new ArrayList();
        for (int i = 0; i < sample.size() ; i++) {
            foundFirstFour.add(sample.get(i).getValue());
        }
        List<String> expectedFirstFour = Arrays.asList("Ace", "Ace", "Ace", "Ace");

        assertEquals( foundFirstFour, expectedFirstFour);
        }


    @Test
    public void getCards_shuffleChangesDeckOrder() {
        Deck testDeck = new Deck();
        // pick 4 random Cards from the deck before and after shuffling
        Random rand  = new Random();
        int min = 0;
        int max = 51;
        int random1 = rand.nextInt( max - min + 1) + min;
        int random2 = rand.nextInt( max - min + 1) + min;
        Card firstUnshuffled = testDeck.getCards().get(0);
        Card lastUnshuffled = testDeck.getCards().get(testDeck.getCards().size()-1);
        Card randUnshuffled1 = testDeck.getCards().get(random1);
        Card randUnshuffled2 = testDeck.getCards().get( random2 );
        List<Card> sampleBefore = Arrays.asList(firstUnshuffled, lastUnshuffled, randUnshuffled1, randUnshuffled2);

        testDeck.shuffle();

        // check first and last cards afterwards
        Card firstShuffled = testDeck.getCards().get(0);
        Card lastShuffled = testDeck.getCards().get(testDeck.getCards().size()-1);
        Card randShuffled1 = testDeck.getCards().get(random1);
        Card randShuffled2 = testDeck.getCards().get( random2 );
        List<Card> sampleAfter = Arrays.asList(firstShuffled, lastShuffled, randShuffled1, randShuffled2);
        boolean comparison = verifyListMatch(sampleBefore, sampleAfter);

        assertFalse( comparison );
    }
}
