package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.Card;
import jackson.rick.cards.Deck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Hand {
    private Integer category;
    private List<Card> hand;
    
    public Hand() {
        this.category = 0;
        this.hand = new ArrayList<>();
    }
    
    List<Card> get() {
        return this.hand;
    }
    
    void add(Card card) {
        this.hand.add(card);
    }
    
    Integer getCategory() {
        return this.category;
    }
    
    void setCategory(Integer category) {
        this.category = category;
    }
}
