package jackson.rick.cards.french.rank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 2/22/17.
 */
public class RankTest {
    private Rank ace;
    private Rank king;
    private Ace aceClass;
    
    @Before public void setup() {
        this.ace = new Ace();
        this.king = new King();
        this.aceClass = new Ace();
    }
    
    @Test public void hashCodeTest() {
        assertEquals(ace.hashCode(), aceClass.hashCode());
        assertNotEquals(ace.hashCode(), king.hashCode());
    }
    
    @Test public void equalsTest() {
        assertTrue(ace.equals(aceClass));
        assertFalse(ace.equals(king));
    }
    
    @Test public void compareToTest() {
        assertEquals(ace.compareTo(ace), 0);
        assertEquals(ace.compareTo(king), -1);
    }
    
    @Test public void compareTest() {
        assertEquals(ace.compare(aceClass, king), -1);
    }
}
