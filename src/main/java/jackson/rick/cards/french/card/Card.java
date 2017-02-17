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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        
        Card card = (Card) o;
        
        return getRank().getHighValue() == card.getRank().getHighValue() &&
                getRank().getLowValue() == card.getRank().getLowValue() &&
                getSuit().getHighValue() == card.getSuit().getLowValue() &&
                getSuit().getLowValue() == card.getSuit().getLowValue();
    }
    
    @Override
    public int hashCode() {
        int result = ((rank == null) ? 0 : getRank().hashCode());
        result = 31 * result + ((suit == null) ? 0 : getSuit().hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return String.format("%s of %ss", getRank().getClass().getSimpleName(),
                getSuit().getClass().getSimpleName());
    }
    
    public String toShorthand() {
        return this.rank.getIndex() + this.suit.getSymbol();
    }
    
    public Rank getRank() {
        return rank;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public Card getCard() {
        return this;
    }
    
    public String getBack() {
        return back;
    }
    
    public void setBack(String back) {
        this.back = back;
    }
    
    public String getFace() {
        return back;
    }
    
    public void setFace(String face) {
        this.face = face;
    }
    
    public boolean equalsIgnoreRank(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        
        Card card = (Card) o;
        
        return getSuit().getHighValue() == card.getSuit().getLowValue() &&
                getSuit().getLowValue() == card.getSuit().getLowValue();
    }
    
    public boolean equalsIgnoreSuit(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        
        Card card = (Card) o;
        
        return getRank().getHighValue() == card.getRank().getHighValue() &&
                getRank().getLowValue() == card.getRank().getLowValue();
    }
    
    public boolean canEqual(Object o) {
        return o instanceof Card;
    }
    
    private Card objectToCard(Object o) {
        return (Card) o;
    }
}
