package jackson.rick.cards.old;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/27/17.
 */
public class CardTest {
    private Card card;

    @Before
    public void setUp() {
        card = new Card(Rank.ACE, Suit.CLUBS);
    }

//    @Test
//    public void toStringTest() {
//        String expected = "Four of Clubs";
//        String actual = this.card.toString();
//        System.out.println("Expected : " + expected);
//        System.out.println("Actual   : " + actual);
//        assertEquals(String.format("I expected the result to be: %s", expected),
//                expected, actual);
//    }
//
//    @Test
//    public void symbolTest() {
//        String expected = "A♣";
//        String actual = this.card.shorthand();
//        System.out.println("Expected : " + expected);
//        System.out.println("Actual   : " + actual);
//        assertEquals(String.format("I expected the result to be: %s", expected),
//                expected, actual);
//    }
}
