package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.*;

/**
 * Created by rickjackson on 2/4/17.
 */
class Card {
    Rank rank;
    Suit suit;
    
    Card() {
        
    }
    
    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    Card(Rank rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return String.format("%s of %ss", this.getRank(), this.getSuit());
    }
    
    public String getRank() {
        return this.rank.toString();
    }
    
    public String getSuit() {
        return this.suit.getSuit();
    }
}
