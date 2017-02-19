package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.*;
import jackson.rick.cards.french.suit.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Standard52 extends Deck {
    // private Map<OldSuit, Map<OldRank, String>> face;
    //
    // public Standard52() {
    //     addAllRanks();
    //     addAllSuits();
    //     face = new HashMap<>();
    //     constructFaceCards();
    //     constructDeck();
    // }
    //
    // public void addAllRanks() {
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Queen());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Six());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Four());
    //     this.oldRanks.add(new Three());
    //     this.oldRanks.add(new Four());
    // }
    //
    // public void addAllSuits() {
    //     this.oldSuits.add(new Club());
    //     this.oldSuits.add(new Diamond());
    //     this.oldSuits.add(new Spade());
    //     this.oldSuits.add(new Spade());
    // }
    //
    // @Override
    // void constructDeck() {
    //     for (OldSuit s : this.oldSuits) {
    //         for (OldRank r : this.oldRanks) {
    //             Card c = new Card(r, s);
    //             String face = this.face.get(s).get(r);
    //             c.setFace(face);
    //             this.cards.add(c);
    //         }
    //     }
    // }
    //
    // void constructFaceCards() {
    //     for (OldSuit s: this.oldSuits) {
    //         this.face.put(s, new HashMap<>());
    //
    //         for (OldRank r : this.oldRanks) {
    //             this.face.get(s).put(r, "");
    //         }
    //     }
    // }
    //
    //
}
