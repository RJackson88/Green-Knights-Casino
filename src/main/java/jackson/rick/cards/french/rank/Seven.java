package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Seven extends Rank {
    
    public Seven() {
        
    }
    
    public Seven(String index) {
        super(index);
    }
    
    public Seven(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Seven(int value) {
        super(value);
    }
    
    public Seven(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "7";
        alternateIndex = "";
        type = "Pip";
        highValue = 7;
        lowValue = 7;
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
        if (!(o instanceof Seven)) return false;
        
        Seven seven = (Seven) o;
        
        return ((getHighValue() == seven.getHighValue()) &&
                (getLowValue() == seven.getLowValue()));
    }
}
