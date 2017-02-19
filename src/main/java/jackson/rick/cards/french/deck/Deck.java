package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.OldRank;
import jackson.rick.cards.french.suit.OldSuit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Deck extends Card {
    // List<Card> cards;
    // List<OldRank> oldRanks;
    // List<OldSuit> oldSuits;
    //
    // public Deck() {
    //     this.cards = new ArrayList<>();
    //     this.oldRanks = new ArrayList<>();
    //     this.oldSuits = new ArrayList<>();
    //     constructDeck();
    // }
    //
    // void constructDeck() {
    //     for (OldSuit s : this.oldSuits) {
    //         for (OldRank r : this.oldRanks) {
    //             Card c = new Card(r, s);
    //             this.cards.add(c);
    //         }
    //     }
    // }
    //
    // public Card dealTopCard() {
    //     Card card = this.cards.get(0);
    //     this.cards.remove(card);
    //     return card;
    // }
    //
    // public void shuffle() {
    //     Collections.shuffle(this.cards);
    // }
    //
    // public int getCard(int index) {
    //     return this.cards.indexOf(index);
    // }
    //
    // public List<OldRank> getOldRanks() {
    //     return this.oldRanks;
    // }
    //
    // public List<OldSuit> getOldSuits() {
    //     return this.oldSuits;
    // }
    //
    // public int getRankSize() {
    //     return this.oldRanks.size();
    // }
    //
    // public int getSuitSize() {
    //     return this.oldSuits.size();
    // }
    //
    // public void addRank(OldRank oldRank) {
    //     this.oldRanks.add(oldRank);
    // }
    //
    // public void addSuit(OldSuit oldSuit) {
    //     this.oldSuits.add(oldSuit);
    // }
    //
    // public void printAllCards() {
    //     for (Card c : this.cards) {
    //         System.out.println(c.toShorthand() + " : " + c.toString());
    //     }
    // }
    //
    // // public void sortByRankThenSuit() {}
    // //
    // // public void sortBySuitThenRank() {}
    // //
    // // public Optional<Card> getCard(String r, String s) {
    // //     Optional<Card> card = this.cards.stream()
    // //                      .filter(c -> c.oldRank.toString().equals(r) &&
    // //                             c.oldSuit..equals(s))
    // //                      .findFirst();
    // //     return card;
    // // }
}
