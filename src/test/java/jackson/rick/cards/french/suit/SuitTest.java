package jackson.rick.cards.french.suit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 2/18/17.
 */
public class SuitTest {
    private Suit club;
    private Suit diamond;
    private Club clubClass;
    
    @Before
    public void setup() {
        clubClass = new Club();
        club = new Club();
        diamond = new Diamond();
    }
    
    @Test
    public void getSymbolTest() {
        assertEquals(club.getSymbol(), "♣");
    }
    
    @Test
    public void getColorTest() {
        assertEquals(club.getColor(), "Black");
    }
    
    @Test
    public void getAlternateColorTest() {
        assertEquals(club.getAlternateColor(), "Green");
    }
    
    @Test
    public void getBlackSymbolTest() {
        assertEquals(club.getWhiteSymbol(), "♣");
    }
    
    @Test
    public void getWhiteSymbolTest() {
        assertEquals(club.getWhiteSymbol(), "♧");
    }
    
    @Test
    public void getHighValueTest() {
        assertEquals(club.getHighValue(), 1);
    }
    
    @Test
    public void getLowValueTest() {
        assertEquals(club.getLowValue(), 1);
    }
    
    @Test
    public void hashCodeTest() {
        assertEquals(club.hashCode(), clubClass.hashCode());
        assertNotEquals(club.hashCode(), diamond.hashCode());
    }
    
    @Test
    public void equalsTest() {
        assertTrue(club.equals(clubClass));
        assertFalse(club.equals(diamond));
    }
    
    @Test
    public void compareToTest() {
        assertEquals(club.compareTo(clubClass), 0);
        assertEquals(club.compareTo(diamond), 1);
    }
    
    @Test
    public void compareTest() {
        assertEquals(club.compare(diamond, clubClass), -1);
    }
}
