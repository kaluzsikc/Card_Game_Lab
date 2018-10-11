public class Card {

    private SuitType suit;
    private RankType rank;

    public Card( RankType rank, SuitType suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public SuitType getSuit(){

        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }
}
