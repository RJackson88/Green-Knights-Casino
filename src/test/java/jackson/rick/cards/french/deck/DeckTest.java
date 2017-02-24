package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 2/23/17.
 */
public class DeckTest {
    private Standard52 deck;
    private Deck<Card> deck2;
    
    @Before
    public void Setup() {
        deck = new Standard52(52);
    }
    
    @Test
    public void testPrintAllToScreen() {
        for (Card c : deck) {
            System.out.println(c.toShorthand());
        }
    }
    
    @Test
    public void testShuffle() {
        System.out.println(deck.get(0));
        System.out.println(deck.get(0));
        deck.shuffle();
        System.out.println(deck.get(0));
    }
    
    @Test
    public void testDeal() {
        System.out.println(deck.get(0));
        System.out.println(deck.size());
        deck.shuffle();
        System.out.println(deck.get(0));
        System.out.println(deck.deal());
        System.out.println(deck.size());
        System.out.println(deck.get(0));
        System.out.println(deck.size());
    }
    
    @Test
    public void testReset() {
        System.out.println(deck.size());
        deck.shuffle();
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.size());
        deck.reset();
        System.out.println(deck.size());
        System.out.println(deck.get(51));
    }
    
}
