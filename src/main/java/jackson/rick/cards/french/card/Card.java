package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Card {
    public static Rank RANK;
    public static Suit SUIT;
    public String back;
    public String face;

    public Card() {

    }

    public Card(Rank rank, Suit suit) {
        this.RANK = rank;
        this.SUIT = suit;
        this.back = "\uD83C\uDCA0";
        this.face = "\uD83C\uDCA0";
    }

    public Card(Rank rank) {
        
    }
    
    
    // Query and Modification Operations
    
    
    // Bulk Operations
    
    
    // Comparison and Hashing
    
    @Override
    public int hashCode() {
        int result = ((RANK == null) ? 0 : RANK.hashCode());
        result = 31 * result + ((SUIT == null) ? 0 : SUIT.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        
        Card card = (Card) o;
        if ((RANK.isWild() || card.RANK.isWild()) &&
            (SUIT.isWild() || card.SUIT.isWild()))
            return true;
        
        return ((RANK.getHighValue() == card.RANK.getHighValue()) &&
                (RANK.getLowValue() == card.RANK.getLowValue()) &&
                (SUIT.getHighValue() == card.SUIT.getHighValue()) &&
                (SUIT.getLowValue() == card.SUIT.getLowValue()));
    }
    
    public int compareTo(Card card) {
        if (SUIT.getLowValue() == card.SUIT.getLowValue())
            return (RANK.getLowValue() - card.RANK.getLowValue());
        else
            return (card.SUIT.getLowValue() - SUIT.getLowValue());
    }
    
    public int compare(Card card1, Card card2) {
        if (card1.RANK.getHighValue() == card2.RANK.getHighValue())
            return (card2.SUIT.getHighValue() - card1.SUIT.getHighValue());
        else
            return (card2.RANK.getHighValue() - card2.RANK.getHighValue());
    }
    
    
    // String Conversion
    
    @Override
    public String toString() {
        return RANK.toString() + " of " + SUIT.toString();
    }
    
    public String toShorthand() {
        return RANK.index() + SUIT.symbol();
    }
    
    
    
    
    
    
    //
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (!(o instanceof Card)) return false;
    //
    //     Card card = (Card) o;
    //
    //     return getOldRank().getHighValue() == card.getOldRank().getHighValue() &&
    //             getOldRank().getLowValue() == card.getOldRank().getLowValue() &&
    //             getOldSuit().getHighValue() == card.getOldSuit().getLowValue() &&
    //             getOldSuit().getLowValue() == card.getOldSuit().getLowValue();
    // }
    //
    // @Override
    // public int hashCode() {
    //     int result = ((oldRank == null) ? 0 : getOldRank().hashCode());
    //     result = 31 * result + ((oldSuit == null) ? 0 : getOldSuit().hashCode());
    //     return result;
    // }
    //
    // @Override
    // public String toString() {
    //     return String.format("%s of %ss", getOldRank().getClass().getSimpleName(),
    //             getOldSuit().getClass().getSimpleName());
    // }
    //
    // public String toShorthand() {
    //     return this.oldRank.getIndex() + this.oldSuit.getSymbol();
    // }
    //
    // public OldRank getOldRank() {
    //     return oldRank;
    // }
    //
    // public OldSuit getOldSuit() {
    //     return oldSuit;
    // }
    //
    // public Card getCard() {
    //     return this;
    // }
    //
    // public String getBack() {
    //     return back;
    // }
    //
    // public void setBack(String back) {
    //     this.back = back;
    // }
    //
    // public String getFace() {
    //     return back;
    // }
    //
    // public void setFace(String face) {
    //     this.face = face;
    // }
    //
    // public boolean equalsIgnoreRank(Object o) {
    //     if (this == o) return true;
    //     if (!(o instanceof Card)) return false;
    //
    //     Card card = (Card) o;
    //
    //     return getOldSuit().getHighValue() == card.getOldSuit().getLowValue() &&
    //             getOldSuit().getLowValue() == card.getOldSuit().getLowValue();
    // }
    //
    // public boolean equalsIgnoreSuit(Object o) {
    //     if (this == o) return true;
    //     if (!(o instanceof Card)) return false;
    //
    //     Card card = (Card) o;
    //
    //     return getOldRank().getHighValue() == card.getOldRank().getHighValue() &&
    //             getOldRank().getLowValue() == card.getOldRank().getLowValue();
    // }
    //
    // public boolean canEqual(Object o) {
    //     return o instanceof Card;
    // }
    //
    // private Card objectToCard(Object o) {
    //     return (Card) o;
    // }
}
