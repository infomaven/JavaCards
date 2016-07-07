package test;

import main.Card;
import main.Deck;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

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
    public void getCards_deckContains52UniqueCards_kingOfDiamonds() {
        Deck testDeck = new Deck();
        Card found = testDeck.getCards().get(51);
        assertEquals("King of Diamonds", found.getName());
    }

    // todo: come up with a more robust uniqueness test
    /*
    No duplicates exist in the deck
     */
@Test
    public void getCards_noDuplicatesInDeck_true() {
    Deck testDeck = new Deck();
    int setSize = 0;
    Set<Card> cardSet = new HashSet<Card>( testDeck.getCards());
    setSize = cardSet.size();

    assertNotSame( testDeck.getCards().size(), setSize);
}

    // todo: create test for shuffle

    // todo: create test for sort


}
