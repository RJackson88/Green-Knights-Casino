package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Club;
import jackson.rick.cards.french.suit.Spade;
import jackson.rick.cards.french.suit.Suit;

import java.util.Optional;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Test {
    
    public static void main(String[] args) {
        Standard52 deck = new Standard52();
        Optional<Card> optional = deck.getCard("Ace", "Spade");
        Card card = optional.get();
    
        System.out.println(card);
    }
}
