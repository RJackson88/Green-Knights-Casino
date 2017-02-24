package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;

import java.util.Optional;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Test {
    
    public static void main(String[] args) {
        Deck<Card> deck = new Standard52();
        
        for (int i = 0; i < 52; i++) {
            System.out.print(deck.get(i).toString() + " :  ");
            System.out.print(deck.get(i).toShorthand() + "  ");
            System.out.println(deck.get(i).getFace());
        }
    }
}
