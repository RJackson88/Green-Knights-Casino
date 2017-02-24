package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.Rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Flush {
    private List<Card> hand = new ArrayList<>(7);
    private Card[] bestHand = new Card[5];
    
    public Flush() {
        
    }
    
    public boolean isFlush(List hand) {
        
        return false;
        
    }
    
    public Comparator<Card> byRank = (c1, c2) -> (c2.rank.getHighValue()
                                                  - c1.rank.getHighValue());
    
    public Comparator<Card> bySuit = (c1, c2) -> (c1.suit.getHighValue()
                                                  - c2.suit.getHighValue());
    
    public void testFlush(List<Card> hand) {
        hand.stream()
            .sorted(bySuit.thenComparing(byRank))
            .forEach(c -> System.out.println(c));
        
        
        // Comparator<Card> byRankThenSuit = (c1, c2) -> Comparator.compare(
        //         c1.rank.getHighValue(), c2.rank.getHighValue());
        
        // Comparator<Card> bySuitThenRank = (c1, c2) -> {
        //     if (c1.suit == c2.suit) {
        //         return c2.rank.getHighValue() - c1.rank.getHighValue();
        //     } else {
        //         return c2.suit.getHighValue() - c1.suit.getHighValue();
        //     }};
        
        // hand.sort(bySuitThenRank);
        // hand.stream()
        //     .sorted(bySuitThenRank)
        //     .forEach(c -> System.out.println(c));
    }
    
    // public void sortHandBySuitsThenRank(List hand) {
    //     Collections.sort(hand);
    // }
    //
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
    //
    // public static void printToScreen() {
    //     System.out.println(hand.toString());
    // }
}
