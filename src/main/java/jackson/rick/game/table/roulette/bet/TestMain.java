package jackson.rick.game.table.roulette.bet;

/**
 * Created by rickjackson on 1/31/17.
 */
public class TestMain {

    public static void main(String[] args) {
        StraightUp straightUp = new StraightUp();
        Split split = new Split();
        Street street = new Street();
        Corner corner = new Corner();
        Line line = new Line();
        Trio trio = new Trio();
        Basket basket = new Basket();
        Topline topline = new Topline();
        HighLow highLow = new HighLow();
        RedBlack redBlack = new RedBlack();
        EvenOdd evenOdd = new EvenOdd();
        Dozen dozen = new Dozen();
        Column column = new Column();
    
        System.out.println("\nSTRAIGHT UP / SINGLE NUMBER BETS:\n");
        straightUp.printStraightUp();
        System.out.println("\nSPLIT BETS:\n");
        split.printSplits();
        System.out.println("\nSTREET BETS:\n");
        street.printStreets();
        System.out.println("\nCORNER / SQUARE BETS:\n");
        corner.printCorners();
        System.out.println("\nSIX LINE / DOUBLE STREET BETS:\n");
        line.printLines();
        System.out.println("\nTRIO BETS:\n");
        trio.printTrio();
        System.out.println("\nBASKET / FIRST FOUR BETS:\n");
        basket.printBasket();
        System.out.println("\nTOPLINE BETS:\n");
        topline.printTopline();
        System.out.println("\n1 TO 18 (LOW), OR 19 TO 36 (HIGH) BETS:\n");
        highLow.printHighLow();
        System.out.println("\nRED OR BLACK BETS:\n");
        redBlack.printRedBlack();
        System.out.println("\nEVEN OR ODD BETS:\n");
        evenOdd.printEvenOdd();
        System.out.println("\nDOZEN BETS:\n");
        dozen.printDozens();
        System.out.println("\nCOLUMN BETS:\n");
        column.printColumns();
        
    }
}
