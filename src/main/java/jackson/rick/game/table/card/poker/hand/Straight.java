package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.rank.Two;
import jackson.rick.cards.french.suit.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Straight {
    private Card[] straightHand = new Card[5];
    private Card previousCard = null;
    
    public boolean isStraight(List<Card> hand, List<Card> community) {
        hand.addAll(community);
        hand.sort(byRank);
        
        for (Card c : hand) {
            if (previousCard != null) {
                if (c.rank.equals(previousCard.rank)) {
                    continue;
                } else if (previousCard.rank.equals(new Two())
                           && hand.get(0).rank.equals(new Ace())) {
                    straightHand[straightHand.length-1] = c;
                } else if (previousCard.rank.getHighValue() - 1
                           == c.rank.getHighValue()) {
                    straightHand[straightHand.length-1] = c;
                } else {
                    straightHand = new Card[5];
                }
            } else {
                straightHand[straightHand.length-1] = c;
            }
        }
        return straightHand.length == 5;
    }
    
    // public List<Card> getStraightHand() {
    //     return straightHand;
    // }

    // public List<Card> winningHand() {
    //     return straightHand;
    // }


    public static Comparator<Card> byRank = (c1, c2) -> (c2.rank.getHighValue()
                                                         - c1.rank.getHighValue());

    public static Comparator<Card> bySuit = (c1, c2) -> (c1.suit.getHighValue()
                                                         - c2.suit.getHighValue());

    public void testStraight(List<Card> hand) {
        hand.stream()
            .sorted(byRank)
            .forEach(c -> System.out.print(c.toShorthand() + " "));
        System.out.println();
    }
}
