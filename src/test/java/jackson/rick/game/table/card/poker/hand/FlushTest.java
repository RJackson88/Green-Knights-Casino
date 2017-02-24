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
 * Created by rickjackson on 2/23/17.
 */
public class FlushTest {
    // private Flush flush;
    // private List<Card> deck;
    // private List<Card> hand;
    // private List<Rank> ranks;
    // private List<Suit> suits;
    // private Random random;
    // // Card aceSpades = new Card(new Ace(), new Spade());
    // // Card kingSpades = new Card(new King(), new Spade());
    // // Card queenSpades = new Card(new Queen(), new Spade());
    // // Card jackSpades = new Card(new Jack(), new Spade());
    // // Card tenSpades = new Card(new Ten(), new Spade());
    // // Card nineSpades = new Card(new Nine(), new Spade());
    // // Card eightSpades = new Card(new Eight(), new Spade());
    // // Card sevenSpades = new Card(new Seven(), new Spade());
    // // Card sixSpades = new Card(new Six(), new Spade());
    // // Card fiveSpades = new Card(new Five(), new Spade());
    // // Card fourSpades = new Card(new Four(), new Spade());
    // // Card threeSpades = new Card(new Three(), new Spade());
    // // Card twoSpades = new Card(new Two(), new Spade());
    //
    // @Before
    // public void Setup() {
    //     flush = new Flush();
    //     deck = new ArrayList<>(52);
    //     hand = new ArrayList<>(7);
    //     ranks = new ArrayList<>(13);
    //     suits = new ArrayList<>(4);
    //     random = new Random();
    //
    //     ranks.add(new Ace());
    //     ranks.add(new King());
    //     ranks.add(new Queen());
    //     ranks.add(new Jack());
    //     ranks.add(new Ten());
    //     ranks.add(new Nine());
    //     ranks.add(new Eight());
    //     ranks.add(new Seven());
    //     ranks.add(new Six());
    //     ranks.add(new Five());
    //     ranks.add(new Four());
    //     ranks.add(new Three());
    //     ranks.add(new Two());
    //
    //     suits.add(new Club());
    //     suits.add(new Diamond());
    //     suits.add(new Heart());
    //     suits.add(new Spade());
    //
    //     for (Suit s : suits) {
    //         for (Rank r : ranks) {
    //             deck.add(new Card(r, s));
    //         }
    //     }
    //
    // }
    //
    // @Test
    // public void testFlush() {
    //     Collections.shuffle(deck);
    //
    //     int size = 52;
    //     for (int i = 0; i < 7; i++) {
    //         int index = random.nextInt(size);
    //         hand.add(deck.remove(index));
    //         size--;
    //     }
    //     flush.testFlush(hand);
    //
    //     // hand.add(twoSpades);
    //     // hand.add(fiveSpades);
    //     // hand.add(aceSpades);
    //     // hand.add(jackSpades);
    //     // hand.add(threeSpades);
    //     // hand.add(queenSpades);
    //     // hand.add(kingSpades);
    // }
}
