package jackson.rick.cards.french.suit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 2/20/17.
 */
public class ClubTest {
    private Club club1;
    private Suit club2;
    private Club club3;
    private Suit diamond;
    
    @Before
    public void setup() {
        club1 = new Club();
        club2 = new Club("Symbol", "Other");
        club3 = new Club(2);
        diamond = new Diamond();
    }
    
    @Test
    public void hashCodeTest() {
        assertEquals(club1.hashCode(), club2.hashCode());
        assertTrue(club1.hashCode() != club3.hashCode());
        assertFalse(club1.hashCode() == club3.hashCode());
        assertFalse(club2.hashCode() == diamond.hashCode());
    }
    
    @Test
    public void equalsTest() {
        assertTrue(club1.equals(club2));
        assertFalse(club1.equals(club3));
        assertFalse(club1.equals(diamond));
    }
}
