package jackson.rick.game.table.roulette.bet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Number {
    private List<String> numbers;

    Number() {
        this.numbers = new ArrayList<>();
        constructNumbers();
    }

    void constructNumbers() {
        for (int i = 0; i <= 37; i++) {

            if (i == 37) {
                this.numbers.add("00");
            } else {
                this.numbers.add(Integer.toString(i));
            }
        }
    }

    String get(int index) {
        return this.numbers.get(index);
    }
}
