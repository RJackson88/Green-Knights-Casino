package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Dozen extends Combination {
    private Map<String, List<String>> dozens;
    
    Dozen() {
        this.dozens = new HashMap<>();
        constructDozens();
    }
    
    void constructDozens() {
        this.dozens.put("1st 12", new ArrayList<String>());
        this.dozens.put("2nd 12", new ArrayList<String>());
        this.dozens.put("3rd 12", new ArrayList<String>());
        
        for (int i = 1; i < 37; i++) {
            if (i <= 12) {
                this.dozens.get("1st 12").add(Integer.toString(i));
            } else if (i <= 24) {
                this.dozens.get("2nd 12").add(Integer.toString(i));
            } else {
                this.dozens.get("3rd 12").add(Integer.toString(i));
            }
        }
    }
    
    void printDozens() {
        Iterator itr = this.dozens.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.dozens.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
