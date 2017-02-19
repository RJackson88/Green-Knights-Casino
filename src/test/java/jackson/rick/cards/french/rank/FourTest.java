/**
 * Created by rickjackson on 2/15/17.
 */
package jackson.rick.cards.french.rank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourTest {
    private Four four;
    private Four four2;
    
    @Before
    public void setup() {
        this.four = new Four();
        this.four2 = new Four();
    }
    
    @Test
    public void equalsTest() {
        boolean expected = true;
        boolean actual = four.equals(four2);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void toStringTest() {
        String expected = "Four";
        String actual = four.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void AceTest() {
        boolean expected = true;
        boolean actual = OldRank.class.isInstance(new Four());
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
