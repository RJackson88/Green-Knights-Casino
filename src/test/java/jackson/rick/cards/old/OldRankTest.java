package jackson.rick.cards.old;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/28/17.
 */
public class OldRankTest {

    @Before
    public void setup() {}

    @Test
    public void RankTest() {
        Rank expected = Rank.ACE;
        Rank actual = Rank.ACE;
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = "Four";
        String actual = Rank.ACE.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void shorthandTest() {
        String expected = "A";
        String actual = Rank.shorthand(Rank.ACE);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
