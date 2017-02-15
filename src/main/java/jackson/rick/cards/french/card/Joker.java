/**
 * Created by rickjackson on 2/3/17.
 */
package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Suit;

public class Joker extends Card {
    private String variation;
    
    public Joker() {
        super(null, null);
        this.variation = null;
    }
    
    public Joker(Rank rank) {
        super(rank, null);
        this.variation = null;
    }
    
    public Joker(Rank rank, Suit suit) {
        super(rank, suit);
        this.variation = null;
    }
    
    public Joker(Rank rank, String variation) {
        super(rank, null);
        this.variation = variation;
    }
    
    @Override
    public String toString() {
        
        if (this.suit == null && this.variation == null) {
            return this.rank.toString();
        } else if (this.variation == null) {
            return String.format("%s %s", this.getRank(), this.getSuit());
        } else if (this.suit == null) {
            return String.format("%s %s", this.getVariation(), this.getRank());
        } else {
            return String.format("%s %s of %s", this.getVariation(),
                    this.getRank(), this.getSuit());
        }
    }
    
    @Override
    public String toShorthand() {
        
        if (this.suit == null && this.variation == null) {
            return this.rank.getIndex();
        } else if (this.variation == null) {
            return String.format("%s %s", this.rank.getIndex(),
                    this.suit.getSymbol());
        } else if (this.suit == null) {
            return String.format("%s %s", this.getVariation(),
                    this.rank.getIndex());
        } else {
            return String.format("%s %s of %s", this.getVariation(),
                    this.rank.getIndex(), this.suit.getSymbol());
        }
    }
    
    public String getVariation() {
        return this.variation == null ? null : this.variation;
    }
}
