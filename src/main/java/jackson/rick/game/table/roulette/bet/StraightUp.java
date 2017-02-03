package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class StraightUp extends Combination {
    private Map<String, List<String>> straightUp;
    
    StraightUp() {
        this.straightUp = new HashMap<>();
        constructStraightUp();
    }
    
    void constructStraightUp() {
        for (int i = 0; i <= 37; i++) {
            if (i == 37) {
                this.straightUp.put("00", new ArrayList<String>());
                this.straightUp.get("00").add("00");
            } else {
                this.straightUp.put(Integer.toString(i),
                        new ArrayList<String>());
                this.straightUp.get(Integer.toString(i))
                               .add(Integer.toString(i));
            }
        }
    }
    
    void printStraightUp() {
        Iterator itr = this.straightUp.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.straightUp.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
