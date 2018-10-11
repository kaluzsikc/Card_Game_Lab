import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before(){
        card = new Card(RankType.ACE , SuitType.HEARTS);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE,card.getRank());
    }

    @Test
    public void aceHasValue1(){
        assertEquals(1, card.getValueFromEnum());
    }

}
