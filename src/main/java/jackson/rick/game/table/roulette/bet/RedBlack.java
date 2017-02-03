package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class RedBlack extends Combination {
    private Map<String, List<String>> redBlack;
    
    RedBlack() {
        this.redBlack = new HashMap<>();
        constructRedBlack();
    }
    
    void constructRedBlack() {
        this.redBlack.put("Red", new ArrayList<String>());
        this.redBlack.put("Black", new ArrayList<String>());
        
        for (int i = 1; i < 37; i++) {
            if ((i >= 1 && i <= 10) || (i >= 19 && i <= 28)) {
                if (i % 2 == 1) {
                    redBlack.get("Red").add(Integer.toString(i));
                } else {
                    redBlack.get("Black").add(Integer.toString(i));
                }
            } else {
                if (i % 2 == 1) {
                    redBlack.get("Black").add(Integer.toString(i));
                } else {
                    redBlack.get("Red").add(Integer.toString(i));
                }
            }
        }
    }
    
    void printRedBlack() {
        Iterator itr = this.redBlack.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.redBlack.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
