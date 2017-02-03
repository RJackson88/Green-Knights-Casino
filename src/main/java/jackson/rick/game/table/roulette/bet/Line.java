package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Line {
    private Map<String, List<String>> lines;
    
    Line() {
        this.lines = new HashMap<>();
        constructLines();
    }
    
    void constructLines() {
        for (int i = 1; i < 34; i++) {
            String key = Integer.toString(i) + "-"
                    + Integer.toString(i + 1) + "-"
                    + Integer.toString(i + 2) + "-"
                    + Integer.toString(i + 3) + "-"
                    + Integer.toString(i + 4) + "-"
                    + Integer.toString(i + 5);
            this.lines.put(key, new ArrayList<String>());
            this.lines.get(key).add(Integer.toString(i));
            this.lines.get(key).add(Integer.toString(i + 1));
            this.lines.get(key).add(Integer.toString(i + 2));
            this.lines.get(key).add(Integer.toString(i + 3));
            this.lines.get(key).add(Integer.toString(i + 4));
            this.lines.get(key).add(Integer.toString(i + 5));
        }
    }
    
    void printLines() {
        Iterator itr = this.lines.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.lines.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
