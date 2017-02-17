/**
 * Created by rickjackson on 2/16/17.
 */
package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.suit.Club;
import jackson.rick.cards.french.suit.Spade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;
    private Card card2;
    private Card card3;
    
    @Before
    public void setup() {
        this.card = new Card(new Ace(), new Spade());
        this.card2 = new Card(new Ace(), new Spade());
        this.card3 = new Card(new Ace(), new Club());
    }
    
    @Test
    public void equalsTest() {
        card3.getSuit().setHighValue(4);
        card3.getSuit().setLowValue(4);
        boolean expected = true;
        boolean actual = card.equals(card3);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void hashCodeTest() {
        //card2.getRank().setLowValue(14);
        int expected = card2.hashCode();
        int actual = card.hashCode();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void equalsIgnoreRank() {
        boolean expected = true;
        boolean actual = card.equalsIgnoreRank(card2);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
