package jackson.rick.game.table.roulette.bet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/31/17.
 */
public class BetTypeTest {

    @Before
    public void setUp() {
    }

    @Test
    public void toStringTest() {
        String expected = "Straight Up";
        String actual = BetType.A.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
