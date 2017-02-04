package jackson.rick.cards.old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rickjackson on 1/27/17.
 */
class Deck {
    List<Card> cards;
    List<Suit> suits;
    List<Rank> ranks;

    public Deck() {
        this.cards = new ArrayList<>();
        this.suits  = new ArrayList<>();
        this.ranks = new ArrayList<>();
        this.constructDeck(this.ranks, this.suits);
    }

    void constructDeck(List<Rank> ranks, List<Suit> suits) {
        for (Suit s : suits) {
            for (Rank r : ranks) {
                Card c = new Card(r, s);
                this.cards.add(c);
            }
        }
    }

    void shuffle() {
        Collections.shuffle(this.cards);
    }

}
