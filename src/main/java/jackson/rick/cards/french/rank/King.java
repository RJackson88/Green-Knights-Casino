package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class King extends Rank {
    
    public King() {
        
    }
    
    public King(String index) {
        super(index);
    }
    
    public King(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public King(int value) {
        super(value);
    }
    
    public King(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "K";
        alternateIndex = "";
        type = "Face";
        highValue = 13;
        lowValue = 13;
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
        if (!(o instanceof Four)) return false;
        
        Four four = (Four) o;
        
        return ((getHighValue() == four.getHighValue()) &&
                (getLowValue() == four.getLowValue()));
    }
}
