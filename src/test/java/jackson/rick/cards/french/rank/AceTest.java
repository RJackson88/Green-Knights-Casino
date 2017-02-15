/**
 * Created by rickjackson on 2/15/17.
 */
package jackson.rick.cards.french.rank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AceTest {
    private Ace ace;
    
    @Before
    public void setup() {
        this.ace = new Ace();
    }
    
    @Test
    public void toStringTest() {
        String expected = "Ace";
        String actual = ace.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void AceTest() {
        boolean expected = true;
        boolean actual = Rank.class.isInstance(new Ace());
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
