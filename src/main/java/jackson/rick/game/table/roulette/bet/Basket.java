package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/2/17.
 */
class Basket extends Combination {
    private Map<String, List<String>> basket;
    
    Basket() {
        this.basket = new HashMap<>();
        constructBasket();
    }
    
    void constructBasket() {
        this.basket.put("0-1-2-3", new ArrayList<String>());
        this.basket.get("0-1-2-3").add("0");
        this.basket.get("0-1-2-3").add("1");
        this.basket.get("0-1-2-3").add("2");
        this.basket.get("0-1-2-3").add("3");
    }
    
    void printBasket() {
        Iterator itr = this.basket.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.basket.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
