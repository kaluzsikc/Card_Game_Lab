import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before(){

        deck = new Deck();
        ArrayList<Player> players = new ArrayList<>();
//        players.add(player1);
//        players.add(player2);

        player1 = new Player("Bob");
        player1 = new Player("Ben");

        game = new Game(deck, players);

    }

    @Test
    public void gameHasCards(){
        deck.populate();
        assertEquals(52, game.getDeck());
    }

    @Test
    public void gameHasPlayers(){
        assertEquals(0, game.getPlayers());
    }

    @Test
    public void addPlayers(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.getPlayers());
    }

    @Test
    public void readyToPlay(){
        game.addPlayer(player1);
        deck.populate();
        game.play();
        assertEquals(51, game.getDeck());
        assertEquals(1, player1.getHandSize());
    }

}
