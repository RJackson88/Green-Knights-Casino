package jackson.rick.card.french.rank;

/**
 * Created by rickjackson on 2/4/17.
 */
class Five implements Rank {
    private String rank;
    private String index;
    private int highValue;
    private int lowValue;
    
    Five() {
        this.rank = "Five";
        this.index = "5";
        this.highValue = 5;
        this.lowValue = 5;
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
        this.rank = "Five";
        this.index = "5";
        this.highValue = 5;
        this.lowValue = 5;
    }
}
