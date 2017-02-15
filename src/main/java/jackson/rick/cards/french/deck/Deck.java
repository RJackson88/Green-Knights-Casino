package jackson.rick.cards.french.deck;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.rank.Rank;
import jackson.rick.cards.french.suit.Spade;
import jackson.rick.cards.french.suit.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Deck extends Card {
    List<Card> cards;
    List<Rank> ranks;
    List<Suit> suits;
    
    public Deck() {
        this.cards = new ArrayList<>();
        this.ranks = new ArrayList<>();
        this.suits = new ArrayList<>();
        constructDeck();
    }
    
    void constructDeck() {
        for (Suit s : this.suits) {
            for (Rank r : this.ranks) {
                Card c = new Card(r, s);
                this.cards.add(c);
            }
        }
    }
    
    public Card dealTopCard() {
        Card card = this.cards.get(0);
        this.cards.remove(card);
        return card;
    }
    
    public void shuffle() {
        Collections.shuffle(this.cards);
    }
    
    public int getCard(int index) {
        return this.cards.indexOf(index);
    }
    
    public List<Rank> getRanks() {
        return this.ranks;
    }
    
    public List<Suit> getSuits() {
        return this.suits;
    }
    
    public int getRankSize() {
        return this.ranks.size();
    }
    
    public int getSuitSize() {
        return this.suits.size();
    }
    
    public void addRank(Rank rank) {
        this.ranks.add(rank);
    }
    
    public void addSuit(Suit suit) {
        this.suits.add(suit);
    }
    
    public void printAllCards() {
        for (Card c : this.cards) {
            System.out.println(c.toShorthand() + " : " + c.toString());
        }
    }
    
    public void sortByRankThenSuit() {}
    
    public void sortBySuitThenRank() {}
    
    public Optional<Card> getCard(String r, String s) {
        Optional<Card> card = this.cards.stream()
                         .filter(c -> c.rank.toString().equals(r) &&
                                c.suit.toString().equals(s))
                         .findFirst();
        return card;
    }
}
