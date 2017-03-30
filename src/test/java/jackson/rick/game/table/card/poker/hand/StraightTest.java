package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.Club;
import jackson.rick.cards.french.suit.Diamond;
import jackson.rick.cards.french.suit.Heart;
import jackson.rick.cards.french.suit.Spade;
import jackson.rick.cards.french.suit.Suit;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by rickjackson on 3/1/17.
 */
public class StraightTest {
    private Straight straight;
    private List<Card> deck;
    private List<Card> community;
    private List<Card> hand;
    private List<Rank> ranks;
    private List<Suit> suits;
    private Random random;
    // Card aceSpades = new Card(new Ace(), new Spade());
    // Card kingSpades = new Card(new King(), new Spade());
    // Card queenSpades = new Card(new Queen(), new Spade());
    // Card jackSpades = new Card(new Jack(), new Spade());
    // Card tenSpades = new Card(new Ten(), new Spade());
    // Card nineSpades = new Card(new Nine(), new Spade());
    // Card eightSpades = new Card(new Eight(), new Spade());
    // Card sevenSpades = new Card(new Seven(), new Spade());
    // Card sixSpades = new Card(new Six(), new Spade());
    // Card fiveSpades = new Card(new Five(), new Spade());
    // Card fourSpades = new Card(new Four(), new Spade());
    // Card threeSpades = new Card(new Three(), new Spade());
    // Card twoSpades = new Card(new Two(), new Spade());
    
    @Before
    public void Setup() {
        straight = new Straight();
        deck = new ArrayList<>(52);
        community = new ArrayList<>(5);
        hand = new ArrayList<>(2);
        ranks = new ArrayList<>(13);
        suits = new ArrayList<>(4);
        random = new Random();
        
        ranks.add(new Ace());
        ranks.add(new King());
        ranks.add(new Queen());
        ranks.add(new Jack());
        ranks.add(new Ten());
        ranks.add(new Nine());
        ranks.add(new Eight());
        ranks.add(new Seven());
        ranks.add(new Six());
        ranks.add(new Five());
        ranks.add(new Four());
        ranks.add(new Three());
        ranks.add(new Two());
        
        suits.add(new Club());
        suits.add(new Diamond());
        suits.add(new Heart());
        suits.add(new Spade());
        
        for (Suit s : suits) {
            for (Rank r : ranks) {
                deck.add(new Card(r, s));
            }
        }
        
    }
    
    @Test
    public void testStraight() {
        Collections.shuffle(deck);
        
        // int size = 52;
        // for (int i = 0; i < 2; i++) {
        //     hand.add(deck.remove(i));
        // }
        //
        // for (int i = 0; i < 5; i++) {
        //     community.add(deck.remove(i));
        // }
        
        hand.add(new Card(new Ace(), new Spade()));
        hand.add(new Card(new King(), new Spade()));

        community.add(new Card(new Two(), new Diamond()));
        community.add(new Card(new Three(), new Heart()));
        community.add(new Card(new Ten(), new Spade()));
        community.add(new Card(new Jack(), new Spade()));
        community.add(new Card(new Queen(), new Spade()));
        
        System.out.println("Hand:");
        straight.testStraight(hand);
        System.out.println("Community:");
        straight.testStraight(community);
        System.out.println();
        System.out.println(straight.isStraight(hand, community));
        // straight.testStraight(straight.winningHand());
    }
}
