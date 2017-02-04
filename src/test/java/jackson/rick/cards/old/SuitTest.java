package jackson.rick.cards.old;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/28/17.
 */
public class SuitTest {

    @Before
    public void setup() {}

    @Test
    public void SuitTest() {
        Suit expected = Suit.CLUBS;
        Suit actual = Suit.CLUBS;
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = "Clubs";
        String actual = Suit.CLUBS.toString();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void symbolTest() {
        String expected = "♣";
        String actual = Suit.symbol(Suit.CLUBS);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void colorTest() {
        String expected = "Black";
        String actual = Suit.color(Suit.CLUBS);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }

    @Test
    public void fourColorTest() {
        String expected = "Green";
        String actual = Suit.fourColor(Suit.CLUBS);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
