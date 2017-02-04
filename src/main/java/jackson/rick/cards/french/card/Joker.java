package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Suit;

/**
 * Created by rickjackson on 2/4/17.
 */
class Joker extends Card {
    private Rank rank;
    private Suit suit;
    private String variation;
    
    Joker() {
        
    }
    
    Joker(Rank rank) {
        this.rank = rank;
        this.suit = null;
        this.variation = null;
    }
    
    Joker(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.variation = null;
    }
    
    Joker(Rank rank, String variation) {
        this.rank = rank;
        this.suit = null;
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
                    this.getRank(), this.getVariation());
        }
    }
    
    public String toShorthand() {
        
        if (this.suit == null && this.variation == null) {
            return this.rank.getIndex();
        } else if (this.variation == null) {
            return String.format("%s %s", this.rank.getIndex(), this.suit.getSymbol());
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
