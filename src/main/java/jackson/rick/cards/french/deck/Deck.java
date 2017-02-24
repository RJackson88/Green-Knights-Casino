package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by rickjackson on 2/4/17.
 */
public abstract class Deck<C extends Card> extends ArrayList<C> {
    public final Ranks ranks = new Ranks(13);
    public final Suits suits = new Suits(4);
    public final Additional additional = new Additional(0);
    List<C> burnedCards = new ArrayList<>();
    
    public Deck() {
        super();
        construct();
    }
    
    public Deck(int initialCapacity) {
        super(initialCapacity);
    }
    
    abstract void construct();
    
    public void shuffle() {
        Collections.shuffle(this);
    }
    
    public Card deal() {
        C c = remove(0);
        burnedCards.add(c);
        return c;
    }
    
    public void reset() {
        this.addAll(burnedCards);
    }
    
    public class Ranks extends ArrayList<Rank> {
        
        public Ranks() {
            super();
        }
        
        public Ranks(int initialCapacity) {
            super(initialCapacity);
        }
    }
    
    public class Suits extends ArrayList<Suit> {
        
        public Suits() {
            super();
        }
        
        public Suits(int initialCapacity) {
            super(initialCapacity);
        }
    }
    
    public class Additional extends ArrayList<Card> {
        
        public Additional() {
            super();
        }
        
        public Additional(int initialCapacity) {
            super(initialCapacity);
        }
    }
}
