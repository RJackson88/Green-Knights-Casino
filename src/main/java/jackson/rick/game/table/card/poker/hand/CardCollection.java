package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by rickjackson on 2/24/17.
 */
public abstract class CardCollection<C extends Card> {
    static final int DEFAULT_CAPACITY = 5;
    Card[] cards;
    private static final Card[] EMPTY_DATA = {};
    private static final Card[] DEFAULT_CAPACITY_EMPTY_DATA = {};
    private int size;
    
    public CardCollection() {
        this.cards = DEFAULT_CAPACITY_EMPTY_DATA;
    }
    
    public CardCollection(int initialCapacity) {
        if (initialCapacity > 0) {
            this.cards = new Card[initialCapacity];
        } else if (initialCapacity == 0) {
            this.cards = EMPTY_DATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "
                                               + initialCapacity);
        }
    }
    
    
    // Query Operations
    
    public Iterator<Card> iterator() {
        return null;
    }
    
    public int size() {
        return 0;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    
}
