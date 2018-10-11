import java.util.ArrayList;

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
//        ArrayList<Card> populatedDeck = new ArrayList<>();
        for(RankType rank : RankType.values()){
            for(SuitType suit : SuitType.values()){
                Card card = new Card(rank, suit);
                addCard(card);
            }
        }
    }
}
