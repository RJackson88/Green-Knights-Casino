/**
 * Created by rickjackson on 2/15/17.
 */
package jackson.rick.cards.french.suit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {
    private Club club;
    
    @Before
    public void setup() {
        this.club = new Club();
    }
    
    @Test
    public void toStringTest() {
        String expected = "Club";
        String actual = club.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void ClubTest() {
        boolean expected = true;
        boolean actual = Suit.class.isInstance(new Club());
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
