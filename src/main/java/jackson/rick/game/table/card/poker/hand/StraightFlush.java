package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;

import java.util.Collections;
import java.util.List;

/**
 * Created by rickjackson on 2/3/17.
 */
public class StraightFlush {
    private OldHand oldHand;
    private List<Card> flushHand;
    private String flushName;
    
    public StraightFlush(OldHand oldHand) {
        this.oldHand = oldHand;
        sortHandBySuitThenRank(this.oldHand);
    }
    
    public boolean checkForStraightFlush(OldHand oldHand) {
        return false;
    }
    
    public void sortHandBySuitThenRank(OldHand oldHand) {
        //Collections.sort(oldHand);
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
