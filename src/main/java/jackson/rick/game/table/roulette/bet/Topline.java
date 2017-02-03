package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Topline extends Combination {
    private Map<String, List<String>> topline;
    
    Topline() {
        this.topline = new HashMap<>();
        constructTopline();
    }
    
    void constructTopline() {
        this.topline.put("0-00-1-2-3", new ArrayList<String>());
        this.topline.get("0-00-1-2-3").add("0");
        this.topline.get("0-00-1-2-3").add("00");
        this.topline.get("0-00-1-2-3").add("1");
        this.topline.get("0-00-1-2-3").add("2");
        this.topline.get("0-00-1-2-3").add("3");
    }
    
    void printTopline() {
        Iterator itr = this.topline.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.topline.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
