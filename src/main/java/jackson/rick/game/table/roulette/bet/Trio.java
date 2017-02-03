package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Trio extends Combination {
    private Map<String, List<String>> trio;
    
    Trio() {
        this.trio = new HashMap<>();
        constructTrio();
    }
    
    void constructTrio() {
        this.trio.put("0-00-2", new ArrayList<String>());
        this.trio.get("0-00-2").add("0");
        this.trio.get("0-00-2").add("00");
        this.trio.get("0-00-2").add("2");
    
        this.trio.put("00-2-3", new ArrayList<String>());
        this.trio.get("00-2-3").add("00");
        this.trio.get("00-2-3").add("2");
        this.trio.get("00-2-3").add("3");
    
        this.trio.put("0-1-2", new ArrayList<String>());
        this.trio.get("0-1-2").add("0");
        this.trio.get("0-1-2").add("1");
        this.trio.get("0-1-2").add("2");
    
        this.trio.put("0-2-3", new ArrayList<String>());
        this.trio.get("0-2-3").add("0");
        this.trio.get("0-2-3").add("2");
        this.trio.get("0-2-3").add("3");
    }
    
    void printTrio() {
        Iterator itr = this.trio.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.trio.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
