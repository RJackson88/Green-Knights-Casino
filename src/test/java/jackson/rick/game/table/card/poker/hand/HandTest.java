/**
 * Created by rickjackson on 2/13/17.
 */
package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.deck.Standard52;
import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Club;
import jackson.rick.cards.french.suit.Spade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {
    private Hand hand;
    private Card card;
    
    @Before
    public void setup() {
        hand = new Hand(7);
        card = new Card(new Ace(), new Club());
        hand.add(card);
    }
    
    @Test
    public void sizeTest() {
        int expected = 1;
        int actual = hand.size();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void isEmptyTest() {
        boolean expected = false;
        boolean actual = hand.isEmpty();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    //@Test
    //public void containsTest() {
    //    boolean expected = true;
    //    boolean actual = hand.contains();
    //    System.out.println("Expected : " + expected);
    //    System.out.println("Actual   : " + actual);
    //    assertEquals(String.format("I expected the result to be: %s", expected),
    //            expected, actual);
    //}
    
    @Test
    public void indexOfTest() {
        int expected = 0;
        int actual = hand.indexOf(card);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void lastIndexOfTest() {
        int expected = 0;
        int actual = hand.lastIndexOf(card);
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
    
    @Test
    public void toArrayTest() {
        Object[] expected = {card};
        Object[] actual = hand.toArray();
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
