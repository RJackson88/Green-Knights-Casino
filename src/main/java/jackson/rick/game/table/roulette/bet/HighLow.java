package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class HighLow {
    private Map<String, List<String>> highLow;
    
    HighLow() {
        this.highLow = new HashMap<>();
        constructHighLow();
    }
    
    void constructHighLow() {
        this.highLow.put("1 to 18", new ArrayList<String>());
        this.highLow.put("19 to 36", new ArrayList<String>());
        
        for (int i = 1; i <= 36; i++) {
            if (i < 19) {
                this.highLow.get("1 to 18").add(Integer.toString(i));
            } else {
                this.highLow.get("19 to 36").add(Integer.toString(i));
            }
        }
    }
    
    void printHighLow() {
        Iterator itr = this.highLow.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.highLow.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
