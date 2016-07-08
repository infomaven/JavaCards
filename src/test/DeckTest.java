package test;

import main.Card;
import main.Deck;
import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by nadine on 7/6/16.
 */
public class DeckTest {

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
    public void getCards_deckIsOrderedByValue_true() {
        Deck testDeck = new Deck();
        testDeck.sortCards();

        // using subList() returns List
        List<Card> sample = testDeck.getCards().subList( 0, 4);
        List<String> foundFirstFour = new ArrayList();
        for (int i = 0; i < sample.size() ; i++) {
            foundFirstFour.add( sample.get(i).getValue() );
        }
        List<String> expectedFirstFour = Arrays.asList("Ace", "Ace", "Ace", "Ace");

        assertEquals( foundFirstFour, expectedFirstFour);
        }


    // todo: create test for shuffle
    @Test
    public void getCards_deckIsShuffled_true() {


    }


}
