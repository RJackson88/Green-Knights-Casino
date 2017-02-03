package jackson.rick.game.table.roulette.bet;

import java.util.*;

/**
 * Created by rickjackson on 2/1/17.
 */
class Column extends Combination {
    private Map<String, List<String>> columns;
    
    Column() {
        this.columns = new HashMap<>();
        constructColumns();
    }
    
    void constructColumns() {
        String key;
        int i = 1;
        
        while (i < 4) {
            if (i == 1) {
                key = "1st Column";
            } else if (i == 2) {
                key = "2nd Column";
            } else {
                key = "3rd Column";
            }
            this.columns.put(key, new ArrayList<String>());
            
            for (int j = i; j < 37; j = j + 3) {
                this.columns.get(key).add(Integer.toString(j));
            }
            i++;
        }
    }
    
    void printColumns() {
        Iterator itr = this.columns.entrySet().iterator();
        
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            try {
                System.out.print(entry.getKey());
                System.out.print(" : ");
                System.out.println(this.columns.get(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
//    Map<String, List<String>> columns;
//    private List<String> c1;
//    private List<String> c2;
//    private List<String> c3;
//    private List<List<String>> winningColumns;
//    private List<List<String>> losingColumns;
//
//
//    Column() {
//        this.columns = new HashMap<>();
//        this.c1 = new ArrayList<>();
//        this.c2 = new ArrayList<>();
//        this.c3 = new ArrayList<>();
//        this.winningColumns = new ArrayList<>();
//        this.losingColumns = new ArrayList<>();
//        constructColumns();
//    }
//
//    void constructOuterColumns() {
//        this.columns.put("Column 1", c1);
//        this.columns.put("Column 2", c2);
//        this.columns.put("Column 3", c3);
//    }
//
//    void constructMapLists(String key, int start, int mod) {
//        for (int i = start; i <= 36; i = i + 3) {
//            if (i % 3 == mod) {
//                this.columns.get(key).add(Integer.toString(i));
//            }
//        }
//    }
//
//    void constructColumns() {
//        constructOuterColumns();
//        constructMapLists("Column 1", 1, 1);
//        constructMapLists("Column 2", 2, 2);
//        constructMapLists("Column 3", 3, 0);
//    }
//
//    void printColumns() {
//        System.out.println(this.columns.get("Column 1"));
//        System.out.println(this.columns.get("Column 2"));
//        System.out.println(this.columns.get("Column 3"));
//    }
//
//    Iterator createColumnIterator(Map map) {
//        return map.entrySet().iterator();
//    }
//
//    void getColumnsOutcome(String number) {
//        Iterator itr = createColumnIterator(this.columns);
//
//        while (itr.hasNext()) {
//            Map.Entry pair = (Map.Entry)itr.next();
//
//            if (this.columns.get(pair.getKey()).contains(number)) {
//                this.winningColumns.add(pair.getKey());
//            } else {
//                this.losingColumns.add(pair.getKey());
//            }
//            itr.remove();
//        }
//        System.out.println("Losing Columns:\n");
//        System.out.println(this.losingColumns);
//        System.out.println("\nWinning Columns:\n");
//        System.out.println(this.winningColumns);
//    }
}
