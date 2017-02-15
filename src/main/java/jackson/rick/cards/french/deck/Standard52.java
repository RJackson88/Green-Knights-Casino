package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Standard52 extends Deck {
    private Map<Suit, Map<Rank, String>> face;
    
    public Standard52() {
        addAllRanks();
        addAllSuits();
        face = new HashMap<>();
        constructFaceCards();
        constructDeck();
    }
    
    public void addAllRanks() {
        this.ranks.add(new Ace());
        this.ranks.add(new King());
        this.ranks.add(new Queen());
        this.ranks.add(new Jack());
        this.ranks.add(new Ten());
        this.ranks.add(new Nine());
        this.ranks.add(new Eight());
        this.ranks.add(new Seven());
        this.ranks.add(new Six());
        this.ranks.add(new Five());
        this.ranks.add(new Four());
        this.ranks.add(new Three());
        this.ranks.add(new Two());
    }
    
    public void addAllSuits() {
        this.suits.add(new Club());
        this.suits.add(new Diamond());
        this.suits.add(new Heart());
        this.suits.add(new Spade());
    }
    
    @Override
    void constructDeck() {
        for (Suit s : this.suits) {
            for (Rank r : this.ranks) {
                Card c = new Card(r, s);
                String face = this.face.get(s).get(r);
                c.setFace(face);
                this.cards.add(c);
            }
        }
    }
    
    void constructFaceCards() {
        for (Suit s: this.suits) {
            this.face.put(s, new HashMap<>());
            
            for (Rank r : this.ranks) {
                this.face.get(s).put(r, "");
            }
        }
    }
    
    
}
