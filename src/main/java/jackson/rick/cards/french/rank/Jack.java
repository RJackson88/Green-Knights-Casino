package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Jack extends Rank {
    
    public Jack() {
        
    }
    
    public Jack(String index) {
        super(index);
    }
    
    public Jack(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Jack(int value) {
        super(value);
    }
    
    public Jack(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "J";
        alternateIndex = "";
        type = "Face";
        highValue = 11;
        lowValue = 11;
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
        if (!(o instanceof Jack)) return false;
        
        Jack jack = (Jack) o;
        
        return ((getHighValue() == jack.getHighValue()) &&
                (getLowValue() == jack.getLowValue()));
    }
}
