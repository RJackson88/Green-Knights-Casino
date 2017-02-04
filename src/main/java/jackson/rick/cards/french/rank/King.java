package jackson.rick.cards.french.rank;


/**
 * Created by rickjackson on 2/3/17.
 */
class King implements Rank{
    private String rank;
    private String index;
    private String type;
    private int highValue;
    private int lowValue;
    
    King() {
        this.rank = "King";
        this.index = "K";
        this.type = "Face";
        this.highValue = 13;
        this.lowValue = 13;
    }
    
    public String toString() {
        return this.rank;
    }
    
    public String getIndex() {
        return this.index;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getHighValue() {
        return this.highValue;
    }
    
    public int getLowValue() {
        return this.lowValue;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void setIndex(String index) {
        this.index = index;
    }
    
    public void setType(String type) {
        this.type = type;
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
        this.rank = "King";
        this.index = "K";
        this.type = "Face";
        this.highValue = 13;
        this.lowValue = 13;
    }
}
