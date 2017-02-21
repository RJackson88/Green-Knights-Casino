/**
 * Created by rickjackson on 2/3/17.
 */
package jackson.rick.cards.french.card;

import jackson.rick.cards.french.rank.OldRank;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.OldSuit;
import jackson.rick.cards.french.suit.Suit;

public class JokerCard extends Card {
    
    // private String variation;
    //
    // public JokerCard() {
    //     super(null, null);
    //     this.variation = null;
    // }
    //
    // public JokerCard(OldRank oldRank) {
    //     super(oldRank, null);
    //     this.variation = null;
    // }
    //
    // public JokerCard(OldRank oldRank, OldSuit oldSuit) {
    //     super(oldRank, oldSuit);
    //     this.variation = null;
    // }
    //
    // public JokerCard(OldRank oldRank, String variation) {
    //     super(oldRank, null);
    //     this.variation = variation;
    // }
    //
    // @Override
    // public String toString() {
    //
    //     if (this.oldSuit == null && this.variation == null) {
    //         return this.oldRank.toString();
    //     } else if (this.variation == null) {
    //         return String.format("%s %s", this.getOldRank(), this.getOldSuit());
    //     } else if (this.oldSuit == null) {
    //         return String.format("%s %s", this.getVariation(), this.getOldRank());
    //     } else {
    //         return String.format("%s %s of %s", this.getVariation(),
    //                 this.getOldRank(), this.getOldSuit());
    //     }
    // }
    //
    // @Override
    // public String toShorthand() {
    //
    //     if (this.oldSuit == null && this.variation == null) {
    //         return this.oldRank.getIndex();
    //     } else if (this.variation == null) {
    //         return String.format("%s %s", this.oldRank.getIndex(),
    //                 this.oldSuit.getSymbol());
    //     } else if (this.oldSuit == null) {
    //         return String.format("%s %s", this.getVariation(),
    //                 this.oldRank.getIndex());
    //     } else {
    //         return String.format("%s %s of %s", this.getVariation(),
    //                 this.oldRank.getIndex(), this.oldSuit.getSymbol());
    //     }
    // }
    //
    // public String getVariation() {
    //     return this.variation == null ? null : this.variation;
    // }
}
