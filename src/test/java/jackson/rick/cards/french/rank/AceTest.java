/**
 * Created by rickjackson on 2/15/17.
 */
package jackson.rick.cards.french.rank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AceTest {
    private Ace ace;
    private Ace ace2;
    
    @Before
    public void setup() {
        this.ace = new Ace();
        this.ace2 = new Ace();
    }
    
    @Test
    public void equalsTest() {
        boolean expected = true;
        boolean actual = ace.equals(ace2);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
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
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
