package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class EvenOdd extends Combination {
    private Map<String, List<String>> evenOdds;
    
    EvenOdd() {
        this.evenOdds = new HashMap<>();
        constructEvenOdds();
    }
    
    void constructEvenOdds() {
        this.evenOdds.put("Even", new ArrayList<String>());
        this.evenOdds.put("Odd", new ArrayList<String>());
        
        for (int i = 1; i < 37; i++) {
            if (i % 2 == 0) {
                this.evenOdds.get("Even").add(Integer.toString(i));
            } else {
                this.evenOdds.get("Odd").add(Integer.toString(i));
            }
        }
    }
    
    void printEvenOdd() {
        Iterator itr = this.evenOdds.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.evenOdds.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
