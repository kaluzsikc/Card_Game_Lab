import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }


    public int getSize() {
       return this.cards.size();
    }

    public void addCard(Card card) {
         this.cards.add(card);
    }

    public void populate() {
        for(RankType rank : RankType.values()){
            for(SuitType suit : SuitType.values()){
                Card card = new Card(rank, suit);
                addCard(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }


    public void removeCard() {
        cards.remove(0);
    }
}
