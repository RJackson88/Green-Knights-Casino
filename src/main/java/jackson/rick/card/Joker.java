package jackson.rick.card;

/**
 * Created by rickjackson on 1/27/17.
 */
public class Joker extends Card {

    Joker(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return (String.format("%s %s", this.suit, this.rank));
    }
}
