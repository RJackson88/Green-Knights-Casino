package jackson.rick.card;

/**
 * Created by rickjackson on 1/29/17.
 */
public class App {

    public static void main(String[] args) {
        Standard52CardDeck deck = new Standard52CardDeck();
//        deck.printCards();
        deck.printSymbols();
        deck.shuffle();
        System.out.println("\nSHUFFLING\n");
        deck.printSymbols();
    }
}
