package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Corner extends Combination {
    private Map<String, List<String>> corners;
    
    Corner() {
        this.corners = new HashMap<>();
        constructCorners();
    }
    
    void constructCorners() {
        for (int i = 1; i < 34; i++) {
            if (i % 3 != 0) {
                String key = Integer.toString(i) + "-"
                        + Integer.toString(i + 1) + "-"
                        + Integer.toString(i + 3) + "-"
                        + Integer.toString(i + 4);
                this.corners.put(key, new ArrayList<String>());
                this.corners.get(key).add(Integer.toString(i));
                this.corners.get(key).add(Integer.toString(i + 1));
                this.corners.get(key).add(Integer.toString(i + 3));
                this.corners.get(key).add(Integer.toString(i + 4));
            }
        }
    }
    
    void printCorners() {
        Iterator itr = this.corners.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.corners.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
