package jackson.rick.cards.french.card;

/**
 * Created by rickjackson on 2/16/17.
 */
import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.rank.King;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Club;
import jackson.rick.cards.french.suit.Diamond;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
    private Card aceClubs;
    private Card aceClubs2;
    private Card kingClubs;
    private Card aceDiamonds;
    
    @Before
    public void setup() {
        aceClubs = new Card(new Ace(), new Club());
        aceClubs2 = new Card(new Ace(), new Club());
        aceDiamonds = new Card(new Ace(), new Diamond());
        kingClubs = new Card(new King(), new Club());
    }
    
    @Test
    public void isWildTest() {
        assertFalse(aceClubs.isWild());
    }
    
    @Test
    public void setWildTest() {
        assertFalse(aceClubs.isWild());
        aceClubs.setWild();
        assertTrue(aceClubs.isWild());
        aceClubs.unsetWild();
        assertFalse(aceClubs.isWild());
    }
    
    @Test
    public void hashCodeTest() {
        assertEquals(aceClubs.hashCode(), aceClubs2.hashCode());
        assertNotEquals(aceClubs.hashCode(), aceDiamonds.hashCode());
        assertEquals(aceClubs.rank.hashCode(), new Ace().hashCode());
        assertEquals(aceClubs.suit.hashCode(), kingClubs.suit.hashCode());
    }
    
    @Test
    public void equalsTest() {
        assertTrue(aceClubs.equals(new Card(new Ace(), new Club())));
        assertTrue(aceClubs2.equals(aceClubs));
        assertFalse(aceClubs.equals(kingClubs));
        assertTrue(aceClubs.rank.equals(aceDiamonds.rank));
        assertFalse(aceClubs.equals(new Card(new Ace(1), new Club())));
        kingClubs.setWild();
        assertTrue(aceClubs.equals(kingClubs));
    }
    
    @Test
    public void compareToTest() {
        assertTrue(aceClubs.compareTo(aceClubs2) == 0);
        assertTrue(aceClubs.compareTo(aceDiamonds) < 0);
        assertTrue(aceClubs.compareTo(kingClubs) < 0);
        assertTrue(kingClubs.compareTo(aceClubs) > 0);
        assertTrue(aceClubs.compareTo(
                new Card(new Ace(20), new Club())) > 0);
    }
    
    @Test
    public void compareTest() {
        assertEquals(-1, aceClubs.compare(aceClubs, kingClubs));
        assertEquals(-1, aceClubs.compare(aceClubs, aceDiamonds));
    }
    
    @Test
    public void toStringTest() {
        assertEquals("Ace of Clubs", aceClubs.toString());
        assertNotEquals(aceClubs.toString(), aceDiamonds.toString());
    }
    
    @Test
    public void toShorthandTest() {
        assertEquals("A♣", aceClubs.toShorthand());
        assertNotEquals(aceClubs.toShorthand(), aceDiamonds.toShorthand());
    }
}
