package jackson.rick.card.old;

import jackson.rick.card.old.Card;
import jackson.rick.card.old.Joker;
import jackson.rick.card.old.Rank;
import jackson.rick.card.old.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/28/17.
 */
public class JokerTest {
    private Card joker;

    @Before
    public void setUp() {
        joker = new Joker(Rank.JOKER, Suit.BLACK);
    }

    @Test
    public void toStringTest() {
        String expected = "Black Joker";
        String actual = joker.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
