package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Three extends Rank {
    
    public Three() {
        
    }
    
    public Three(String index) {
        super(index);
    }
    
    public Three(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Three(int value) {
        super(value);
    }
    
    public Three(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "3";
        alternateIndex = "T";
        type = "Pip";
        highValue = 3;
        lowValue = 3;
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
        if (!(o instanceof Three)) return false;
        
        Three three = (Three) o;
        
        return ((getHighValue() == three.getHighValue()) &&
                (getLowValue() == three.getLowValue()));
    }
}
