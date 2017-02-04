package jackson.rick.card.old;

/**
 * Created by rickjackson on 1/28/17.
 */
class Standard52CardDeck extends Deck {

    public Standard52CardDeck() {
        this.constructRanks();
        this.constructSuits();
        this.constructDeck(this.ranks, this.suits);
    }

    private void constructRanks() {
        this.ranks.add(Rank.ACE);
        this.ranks.add(Rank.TWO);
        this.ranks.add(Rank.THREE);
        this.ranks.add(Rank.FOUR);
        this.ranks.add(Rank.FIVE);
        this.ranks.add(Rank.SIX);
        this.ranks.add(Rank.SEVEN);
        this.ranks.add(Rank.EIGHT);
        this.ranks.add(Rank.NINE);
        this.ranks.add(Rank.TEN);
        this.ranks.add(Rank.JACK);
        this.ranks.add(Rank.QUEEN);
        this.ranks.add(Rank.KING);
    }

    private void constructSuits() {
        this.suits.add(Suit.CLUBS);
        this.suits.add(Suit.DIAMONDS);
        this.suits.add(Suit.HEARTS);
        this.suits.add(Suit.SPADES);
    }

    void printCards() {
        for (Card c : this.cards) {
            System.out.println(c.toString());
        }
    }

    void printSymbols() {
        for (Card c : this.cards) {
            System.out.println(c.symbol());
        }
    }

}
