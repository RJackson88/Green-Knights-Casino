package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Eight extends Rank {
    
    public Eight() {
        
    }
    
    public Eight(String index) {
        super(index);
    }
    
    public Eight(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Eight(int value) {
        super(value);
    }
    
    public Eight(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "8";
        alternateIndex = "";
        type = "Pip";
        highValue = 8;
        lowValue = 8;
        wild = false;
    }
    
    
    // Comparison and Hashing
    
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + toString().hashCode();
        result = 31 * result + getHighValue();
        result = 31 * result + getLowValue();
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eight)) return false;
        
        Eight eight = (Eight) o;
        
        return ((getHighValue() == eight.getHighValue()) &&
                (getLowValue() == eight.getLowValue()));
    }
}
