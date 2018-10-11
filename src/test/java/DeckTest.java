import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Player player1;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player("Bob");
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

    @Test
    public void deckIsShuffled(){
        deck.populate();
        deck.shuffleDeck();
    }

    @Test
    public void cardRemovedFromDeck(){
        deck.populate();
        deck.dealCard();
        assertEquals(51, deck.getSize());
    }

    @Test
    public void cardIsDealtToPlayers(){
        deck.populate();
        deck.dealCard();
        player1.add(card);

        assertEquals(51, deck.getSize());
        assertEquals(1, player1.getHandSize());

    }


}
