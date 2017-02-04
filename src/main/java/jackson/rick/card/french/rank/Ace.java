package jackson.rick.card.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
class Ace implements Rank {
    private String rank;
    private String index;
    private int highValue;
    private int lowValue;
    
    Ace() {
        this.rank = "Ace";
        this.index = "A";
        this.highValue = 14;
        this.lowValue = 1;
    }
    
    public String rank() {
        return this.rank;
    }
    
    public String index() {
        return this.index;
    }
    
    public int highValue() {
        return this.highValue;
    }
    
    public int lowValue() {
        return this.lowValue;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void setIndex(String index) {
        this.index = index;
    }
    
    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }
    
    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(int highValue, int lowValue) {
        setHighValue(highValue);
        setLowValue(lowValue);
    }
    
    public void restoreDefaults() {
        this.rank = "Ace";
        this.index = "A";
        this.highValue = 14;
        this.lowValue = 1;
    }
}
