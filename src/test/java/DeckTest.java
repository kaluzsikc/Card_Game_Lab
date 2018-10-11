import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckIsEmpty(){
        assertEquals(0, deck.getSize());
    }

    @Test
    public void cardAdded(){
        deck.addCard(card);
        assertEquals(1, deck.getSize());
    }

    @Test
    public void deckHasCards(){
        deck.populate();
        assertEquals(52, deck.getSize());
    }
}
