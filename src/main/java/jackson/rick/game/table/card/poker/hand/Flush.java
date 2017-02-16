package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;

import java.util.Collections;
import java.util.List;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Flush {
    
    public Flush() {
        
    }
    
    public boolean isFlush(List hand) {
        return false;
        
    }
    
    public void sortHandBySuitsThenRank(List hand) {
        Collections.sort(hand);
    }
    
    //public int compare(Card card1, Card card2) {
    //    if (card1.getSuit().getHighValue()
    //            == card2.getSuit().getHighValue()) {
    //        if (card1.getRank().getHighValue()
    //                > card2.getRank().getHighValue()) {
    //            return 1;
    //        } else if (card1.getRank().getHighValue()
    //                < card2.getRank().getHighValue()) {
    //            return -1;
    //        } else {
    //            return 0;
    //        }
    //    } else if (card1.getSuit().getHighValue()
    //                    .compareTo(card2.getSuit().getHighValue()) == -1) {
    //        return -1;
    //    } else {
    //        return 1;
    //    }
    //}
}
