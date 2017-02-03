package jackson.rick.game.table.roulette.bet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/31/17.
 */
public class NumberTest {
    private Number number;

    @Before
    public void setUp() {
        this.number = new Number();
    }

    @Test
    public void toStringTest() {
        String expected = "0";
        String actual = this.number.get(0);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
