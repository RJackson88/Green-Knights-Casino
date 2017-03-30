package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.suit.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rickjackson on 2/3/17.
 */
public final class Flush {
    public boolean flush = false;
    private List<Card> flushHand = new ArrayList<>(5);
    
    public Flush() {
        
    }
    
    public boolean isFlush(List<Card> hand, List<Card> community) {
        Suit suit;
        int highCard = 0;
        int index = 0;
        int last = 0;

        hand.addAll(community);
        hand.stream().sorted(byRank.thenComparing(bySuit));
        Collections.sort(hand, byRank);
        Collections.sort(hand, bySuit);

        while (index < hand.size() && index + 4 < hand.size()) {
            suit = hand.get(0).suit;
            last = index + 4;
            
            if (hand.get(index).suit.getHighValue()
                == hand.get(last).suit.getHighValue()) {
                flushHand = hand.subList(index, last + 1);
                return true;
            } else {
                index++;
            }
        }
        return false;
    }
    
    public List<Card> getFlushHand() {
        return flushHand;
    }
    
    public List<Card> winningHand() {
        return flushHand;
    }
    
    
    public static Comparator<Card> byRank = (c1, c2) -> (c2.rank.getHighValue()
                                                  - c1.rank.getHighValue());
    
    public static Comparator<Card> bySuit = (c1, c2) -> (c1.suit.getHighValue()
                                                  - c2.suit.getHighValue());
    
    public void testFlush(List<Card> hand) {
        hand.stream()
            .sorted(bySuit.thenComparing(byRank))
            .forEach(c -> System.out.print(c.toShorthand() + " "));
        System.out.println();
    }
}
