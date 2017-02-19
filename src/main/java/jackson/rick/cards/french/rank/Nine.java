package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Nine extends Rank {
    
    public Nine() {
        
    }
    
    public Nine(String index) {
        super(index);
    }
    
    public Nine(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Nine(int value) {
        super(value);
    }
    
    public Nine(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "9";
        alternateIndex = "";
        type = "Pip";
        highValue = 9;
        lowValue = 9;
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
        if (!(o instanceof Nine)) return false;
        
        Nine nine = (Nine) o;
        
        return ((getHighValue() == nine.getHighValue()) &&
                (getLowValue() == nine.getLowValue()));
    }
}
