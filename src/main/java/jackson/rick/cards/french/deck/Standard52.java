package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.card.Faces;
import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Standard52 extends Deck<Card> {
    Map<Suit, Map<Rank, String>> faces;
    Deck<Card> defaultDeck;
    
    public Standard52() {
        super(52);
        faces = new HashMap<>(4);
        construct();
        defaultDeck = this;
    }
    
    public Standard52(int initialCapacity) {
        super(initialCapacity);
        faces = new HashMap<>(4);
        construct();
        defaultDeck = this;
    }
    
    void construct() {
        addRanks();
        addSuits();
        
        for (Suit s : suits) {
            for (Rank r : ranks) {
                Card c = new Card(r, s);
                // c.setFace(faces.getFaces(r, s));
                add(new Card(r, s));
            }
        }
    }
    
    void addRanks() {
        ranks.add(new Ace());
        ranks.add(new Two());
        ranks.add(new Three());
        ranks.add(new Four());
        ranks.add(new Five());
        ranks.add(new Six());
        ranks.add(new Seven());
        ranks.add(new Eight());
        ranks.add(new Nine());
        ranks.add(new Ten());
        ranks.add(new Jack());
        ranks.add(new Queen());
        ranks.add(new King());
    }
    
    void addSuits() {
        suits.add(new Club());
        suits.add(new Diamond());
        suits.add(new Heart());
        suits.add(new Spade());
    }
}
