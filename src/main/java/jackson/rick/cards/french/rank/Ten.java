package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Ten extends Rank {
    
    public Ten() {
        
    }
    
    public Ten(String index) {
        super(index);
    }
    
    public Ten(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Ten(int value) {
        super(value);
    }
    
    public Ten(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "Ten";
        alternateIndex = "T";
        type = "Pip";
        highValue = 10;
        lowValue = 10;
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
        if (!(o instanceof Ten)) return false;
        
        Ten ten = (Ten) o;
        
        return ((getHighValue() == ten.getHighValue()) &&
                (getLowValue() == ten.getLowValue()));
    }
}
