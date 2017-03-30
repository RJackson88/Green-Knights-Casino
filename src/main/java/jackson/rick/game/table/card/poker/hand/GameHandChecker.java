package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.deck.Deck.Ranks;
import jackson.rick.cards.french.deck.Deck.Suits;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 2/25/17.
 */
public class GameHandChecker {
    final Groups ranks;
    final Groups suits;
    
    public GameHandChecker(Ranks ranks, Suits suits) {
        this.ranks = new Groups(ranks);
        this.suits = new Groups(suits);
    }
    
    private static class Groups<T> {
        private T group;
        private List<List<T>> x;
        
        Groups(T t) {
            if (!(t instanceof Ranks || t instanceof Suits)) {
                throw new IllegalStateException();
            }
            this.group = t;
        }
        
        // private void construct() {
        //     x = new ArrayList<>();
        //     x.add(new ArrayList<>());
        //
        //     for (T e : group) {
        //
        //     }
        // }
        
        
    }
}
