package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.*;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Card {
    public Rank rank;
    public Suit suit;
    public String back;
    public String face;
    
    public Card() {
        
    }
    
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.back = "\uD83C\uDCA0";
        this.face = "\uD83C\uDCA0";
    }
    
    public Card(Rank rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return String.format("%s of %ss", this.getRank(), this.getSuit());
    }
    
    public String toShorthand() {
        return this.rank.getIndex() + this.suit.getSymbol();
    }
    
    public Rank getRank() {
        return this.rank;
    }
    
    public Suit getSuit() {
        return this.suit;
    }
    
    public Card getCard() {
        return this;
    }
    
    public String getBack() {
        return this.back;
    }
    
    public void setBack(String back) {
        this.back = back;
    }
    
    public String getFace() {
        return this.back;
    }
    
    public void setFace(String face) {
        this.face = face;
    }
    
    @Override
    public int hashCode() {
        int result = getRank().hashCode();
        result = 31 * result + getSuit().hashCode();
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (canEqual(o)) {
            Card c = objectToCard(o);
            return (c.canEqual(this) &&
                    this.getRank() == c.getRank() &&
                    this.getSuit() == c.getSuit());
        } else {
            return false;
        }
    }
    
    public boolean equalsIgnoreRank(Object o) {
        if (canEqual(o)) {
            Card c = objectToCard(o);
            return (c.canEqual(this));
        } else {
            return false;
        }
    }
    
    public boolean equalsIgnoreSuit(Object o) {
        if (canEqual(o)) {
            Card c = objectToCard(o);
            return (c.canEqual(this));
        } else {
            return false;
        }
    }
    
    public boolean canEqual(Object o) {
        return o instanceof Card;
    }
    
    private Card objectToCard(Object o) {
        return (Card) o;
    }
}
