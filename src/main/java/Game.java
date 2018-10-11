import java.util.ArrayList;

public class Game {
    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck, ArrayList<Player> players){
        this.deck = deck;
        this.players = players;
    }

    public int getDeck() {
        return deck.getSize();
    }

    public int getPlayers() {
        return players.size();
    }

    public int addPlayer(Player player) {
        players.add(player);
        return players.size();
    }

    public void play() {
        for(Player player : this.players){
            Card card = deck.dealCard();
            player.add(card);
        }
    }
}
