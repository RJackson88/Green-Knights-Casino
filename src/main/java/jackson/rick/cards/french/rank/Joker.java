/**
 * Created by rickjackson on 2/3/17.
 */
package jackson.rick.cards.french.rank;

public class Joker implements Rank {
    private String rank;
    private String index;
    private String altIndex;
    private String type;
    private int highValue;
    private int lowValue;
    
    public Joker() {
        this.rank = "Joker";
        this.index = "Jkr";
        this.altIndex = "";
        this.type = "Wild";
        this.highValue = 15;
        this.lowValue = 15;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Joker)) return false;
        
        Joker joker = (Joker) o;
    
        return (getHighValue() == joker.getHighValue() ||
                getLowValue() == joker.getLowValue());
    }
    
    @Override
    public int hashCode() {
        int result = ((rank == null) ? 0 : rank.hashCode());
        result = 31 * result + getHighValue();
        result = 31 * result + getLowValue();
        return result;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public String getRank() {
        return rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getIndex() {
        return index;
    }
    
    public void setIndex(String index) {
        this.index = index;
    }
    
    public String getAltIndex() {
        return altIndex == null ? index : altIndex;
    }
    
    public void setAltIndex(String altIndex) {
        this.altIndex = altIndex;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getHighValue() {
        return highValue;
    }
    
    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }
    
    public int getLowValue() {
        return lowValue;
    }
    
    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(int highValue, int lowValue) {
        setHighValue(highValue);
        setLowValue(lowValue);
    }
    
    public void setValues(int value) {
        setHighValue(value);
        setLowValue(value);
    }
    
    public void restoreDefaults() {
        this.rank = "Joker";
        this.index = "Jkr";
        this.altIndex = "";
        this.type = "Wild";
        this.highValue = 15;
        this.lowValue = 0;
    }
}
