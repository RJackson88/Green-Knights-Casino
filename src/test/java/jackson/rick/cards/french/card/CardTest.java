/**
 * Created by rickjackson on 2/16/17.
 */
package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.suit.Spade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;
    private Card card2;
    
    @Before
    public void setup() {
        this.card = new Card(new Ace(), new Spade());
        this.card2 = new Card(new Ace(), new Spade());
    }
    
    @Test
    public void equalsTest() {
        boolean expected = true;
        boolean actual = card.equals(card2);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
