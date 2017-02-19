package jackson.rick.cards.french.suit;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 2/18/17.
 */
public class SuitTest {
    private Suit club;
    private Suit diamond;
    
    @Before
    public void setup() {
        this.club = new Club();
        this.diamond = new Diamond();
    }
    
    @Test
    public void getSymbolTest() {
        String expected = "♣";
        String actual = club.getSymbol();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void getColorTest() {
        String expected = "Black";
        String actual = club.getColor();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void getAlternateColorTest() {
        String expected = "Green";
        String actual = club.getAlternateColor();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void getBlackSymbolTest() {
        String expected = "♣";
        String actual = club.getBlackSymbol();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void getWhiteSymbolTest() {
        String expected = "♧";
        String actual = club.getWhiteSymbol();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void getHighValueTest() {
        int expected = 1;
        int actual = club.getHighValue();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void getLowValueTest() {
        int expected = 1;
        int actual = club.getLowValue();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void hashCodeTest() {
        int expected = new Club().hashCode();
        int actual = club.hashCode();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void equalsTest() {
        boolean expected = true;
        boolean actual = club.equals(new Club());
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void compareToTest() {
        int expected = 0;
        int actual = club.compareTo(new Club());
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
    
    @Test
    public void compareTest() {
        int expected = -1;
        int actual = club.compareTo(new Diamond());
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                     expected, actual);
    }
}
