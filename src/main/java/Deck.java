import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

//    private SuitType suit;
//    private RankType rank;

    public Deck(){
        this.cards = new ArrayList<>();
//        this.suit = suit;
//        this.rank = rank;
    }


    public int getSize() {
       return this.cards.size();
    }

    public void addCard(Card card) {
         this.cards.add(card);
    }


    public void populate() {
//        ArrayList<Card> populatedDeck = new ArrayList<>();
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }
}
