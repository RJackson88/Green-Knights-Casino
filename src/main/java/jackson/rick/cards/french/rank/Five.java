package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Five extends Rank {
    
    public Five() {
        
    }
    
    public Five(String index) {
        super(index);
    }
    
    public Five(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Five(int value) {
        super(value);
    }
    
    public Five(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "5";
        alternateIndex = "";
        type = "Pip";
        highValue = 5;
        lowValue = 5;
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
        if (!(o instanceof Five)) return false;
        
        Five five = (Five) o;
        
        return ((getHighValue() == five.getHighValue()) &&
                (getLowValue() == five.getLowValue()));
    }
}
