import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Card card;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before(){
//        card = new Card("Ace", "hearts");
        deck = new Deck();
        player1 = new Player("Bob");
        player2 = new Player("Will");
    }

    @Test
    public void playerHasName(){
        assertEquals("Bob", player1.getName());
    }

    @Test
    public void playerHasEmptyHand(){
        assertEquals(0, player1.getHandSize());
    }

    @Test
    public void playerCanAddCard(){
        deck.populate();
        player1.add(card);
        assertEquals(1, player1.getHandSize());
    }

    @Test
    public void playerCanRemoveCard(){
        deck.populate();
        player1.add(card);
        assertEquals(1, player1.getHandSize());
        player1.remove();
        assertEquals(0, player1.getHandSize());
    }


}
