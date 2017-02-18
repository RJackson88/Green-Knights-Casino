/**
 * Created by rickjackson on 2/18/17.
 */
package jackson.rick.game.table.card.poker.hand;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Hand hand;
    
    @Before
    public void setup() {
        hand = new Hand();
    }
    
    @Test
    public void HandTest() {
        String expected = "Hand";
        String actual = hand.getClass().toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
