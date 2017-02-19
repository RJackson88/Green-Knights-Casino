package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;

import java.util.Collections;
import java.util.List;

/**
 * Created by rickjackson on 2/3/17.
 */
public class StraightFlush {
    private Hand oldHand;
    private List<Card> flushHand;
    private String flushName;
    
    public StraightFlush(Hand oldHand) {
        this.oldHand = oldHand;
        sortHandBySuitThenRank(this.oldHand);
    }
    
    public boolean checkForStraightFlush(Hand oldHand) {
        return false;
    }
    
    public void sortHandBySuitThenRank(Hand oldHand) {
        //Collections.sort(oldHand);
    }
    
    //public int compare(Card card1, Card card2) {
    //    if (card1.getOldSuit().getHighValue()
    //            == card2.getOldSuit().getHighValue()) {
    //        if (card1.getOldRank().getHighValue()
    //                > card2.getOldRank().getHighValue()) {
    //            return 1;
    //        } else if (card1.getOldRank().getHighValue()
    //                < card2.getOldRank().getHighValue()) {
    //            return -1;
    //        } else {
    //            return 0;
    //        }
    //    } else if (card1.getOldSuit().getHighValue()
    //                    .compareTo(card2.getOldSuit().getHighValue()) == -1) {
    //        return -1;
    //    } else {
    //        return 1;
    //    }
    //}
}
