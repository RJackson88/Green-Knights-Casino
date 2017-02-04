package jackson.rick.cards.old;

/**
 * Created by rickjackson on 1/27/17.
 */
class Card {
    private Rank rank;
    private Suit suit;
    private String shorthand;

    Card() {}

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return (String.format("%s of %s", this.rank, this.suit));
    }

    public String toShorthand() {
        return Rank.shorthand(this.rank) + Suit.symbol(this.suit);
    }
    
    public Rank getRank() {
        return this.rank;
    }
    
    public Suit getSuit() {
        return this.suit;
    }
}
