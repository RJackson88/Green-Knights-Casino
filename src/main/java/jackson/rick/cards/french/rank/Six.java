package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Six extends Rank {
    
    public Six() {
        
    }
    
    public Six(String index) {
        super(index);
    }
    
    public Six(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Six(int value) {
        super(value);
    }
    
    public Six(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "6";
        alternateIndex = "";
        type = "Pip";
        highValue = 6;
        lowValue = 6;
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
        if (!(o instanceof Six)) return false;
    
        Six six = (Six) o;
        
        return ((getHighValue() == six.getHighValue()) &&
                (getLowValue() == six.getLowValue()));
    }
}
