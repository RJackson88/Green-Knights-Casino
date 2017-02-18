package jackson.rick.game.table.roulette.bet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Combination {
    private Number numbers;
    private List<List<String>> columnNumbers;

    Combination() {
        this.numbers = new Number();
        this.columnNumbers = new ArrayList<>();
//        constructColumnNumbers();
    }

//    void constructColumnNumbers() {
//        int columnIndex = 0;
//        List<String> tempList = new OldHand<>();
//
//        for (int i = 1; i <= 36; i = i + 3) {
//            if (i % 3 == 1) {
//                tempList.add(Integer.toString(i));
//            }
//        }
//        this.columnNumbers.add(tempList);
//        System.out.println(tempList);
//        tempList.clear();
//
//        for (int i = 2; i <= 36; i = i + 3) {
//            if (i % 3 == 2) {
//                tempList.add(Integer.toString(i));
//            }
//        }
//        this.columnNumbers.clear();
//        System.out.println(tempList);
//        tempList.clear();
//
//        for (int i = 3; i <= 36; i = i + 3) {
//            if (i % 3 == 0) {
//                tempList.add(Integer.toString(i));
//            }
//        }
//        this.columnNumbers.clear();
//        System.out.println(tempList);
//        tempList.clear();
//    }
//
//    void printColumnNumbers() {
//        System.out.println(columnNumbers.get(0));
//        System.out.println(columnNumbers.get(1));
//        System.out.println(columnNumbers.get(2));
//    }

}
