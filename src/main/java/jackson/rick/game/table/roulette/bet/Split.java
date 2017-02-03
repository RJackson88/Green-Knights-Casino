package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Split extends Combination {
    private Map<String, List<String>> splits;
    
    Split() {
        this.splits = new HashMap<>();
        constructSplits();
    }
    
    void constructSplits() {
        String key;
        
        for (int i = 1; i < 36; i++) {
            if (i % 3 != 0) {
                key = Integer.toString(i) + "-" + Integer.toString(i + 1);
                this.splits.put(key, new ArrayList<String>());
                this.splits.get(key).add(Integer.toString(i));
                this.splits.get(key).add(Integer.toString(i + 1));
            }
            
            if (i < 34) {
                key = Integer.toString(i) + "-" + Integer.toString(i + 3);
                this.splits.put(key, new ArrayList<String>());
                this.splits.get(key).add(Integer.toString(i));
                this.splits.get(key).add(Integer.toString(i + 3));
            }
        }
        this.splits.put("0-00", new ArrayList<String>());
        this.splits.get("0-00").add("0");
        this.splits.get("0-00").add("00");
    }
    
    void printSplits() {
        Iterator itr = this.splits.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.splits.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
