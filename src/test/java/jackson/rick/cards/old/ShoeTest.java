package jackson.rick.cards.old;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/31/17.
 */
public class ShoeTest {
    private Shoe shoe;

    @Before
    public void setUp() {
        shoe = new Shoe();
    }

    @Test
    public void getSizeTest() {
        Short expected = 4;
        Short actual = this.shoe.getSize();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void getPenetrationTest() {
        Double expected = 0.75;
        Double actual = this.shoe.getPenetration();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
