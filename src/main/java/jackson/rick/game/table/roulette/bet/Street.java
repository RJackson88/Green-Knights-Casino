package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Street extends Combination {
    private Map<String, List<String>> streets;
    
    Street() {
        this.streets = new HashMap<>();
        constructStreets();
    }
    
    void constructStreets() {
        String key;
    
        for (int i = 1; i < 35; i = i + 3) {
            key = Integer.toString(i) + "-" + Integer.toString(i + 1) + "-" +
                    Integer.toString(i + 2);
            this.streets.put(key, new ArrayList<String>());
            this.streets.get(key).add(Integer.toString(i));
            this.streets.get(key).add(Integer.toString(i + 1));
            this.streets.get(key).add(Integer.toString(i + 2));
        }
    }
    
    void printStreets() {
        Iterator itr = this.streets.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.streets.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
