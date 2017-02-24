package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.NullRank;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.NullSuit;
import jackson.rick.cards.french.suit.Suit;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Card implements Comparable<Card>, Comparator<Card> {
    public final Rank rank;
    public final Suit suit;
    public String back;
    public String face;

    public Card() {
        this(new NullRank(), new NullSuit());
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.face = "\uD83C\uDCA0";
        this.back = "\uD83C\uDCA0";
    }

    public Card(Rank rank) {
        this(rank, null);
    }
    
    public Card(Suit suit) {
        this(null, suit);
    }
    
    
    // Query and Modification Operations
    
    public String getFace() {
        return face;
    }
    
    public void setFace(String face) {
        this.face = face;
    }
    
    public String getBack() {
        return back;
    }
    
    public void setBack(String back) {
        this.back = back;
    }
    
    public boolean isWild() {
        return rankIsWild() && suitIsWild();
    }
    
    public boolean rankIsWild() {
        return (rank != null) && rank.isWild();
    }
    
    public boolean suitIsWild() {
        return (suit != null) && suit.isWild();
    }
    
    public void setWild(boolean wild) {
        if (rank != null) rank.setWild(wild);
        if (suit != null) suit.setWild(wild);
    }
    
    public void setWild() {
        setWild(true);
    }
    
    public void unsetWild() {
        setWild(false);
    }
    
    
    // Bulk Operations
    
    
    // Comparison and Hashing
    
    @Override
    public int hashCode() {
        int result = ((rank == null) ? 0 : rank.getClass().hashCode());
        result = 31 * result + ((suit == null) ? 0
                                               : suit.getClass().hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        
        Card card = (Card) o;
        if (this.isWild() || card.isWild()) return true;
        
        return ((this.rank.equals(card.rank)) &&
                (this.suit.equals(card.suit)));
    }
    
    @Override
    public int compareTo(Card card) {
        if (this.equals(card)) {
            return 0;
        } else {
            return (this.rank.equals(card.rank))
                    ? (this.suit.compareTo(card.suit))
                    : (rank.compareTo(card.rank));
        }
    }
    
    @Override
    public int compare(Card card1, Card card2) {
        return (card1.rank.getHighValue() == card2.rank.getHighValue())
                ? (card1.suit.getHighValue() - card2.suit.getHighValue())
                : (card2.rank.getHighValue() - card1.rank.getHighValue());
    }
    
    
    // String Conversion
    
    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString() + "s";
    }
    
    public String toShorthand() {
        return rank.index() + suit.symbol();
    }
}
