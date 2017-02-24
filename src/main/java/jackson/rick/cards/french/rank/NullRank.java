package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/20/17.
 */
public class NullRank extends Rank {
    
    public NullRank() {
        super();
    }
    
    public NullRank(String index) {
        super(index);
    }
    
    public NullRank(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public NullRank(int value) {
        super(value);
    }
    
    public NullRank(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        setToNullValues();
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
        if (!(o instanceof NullRank)) return false;
        
        NullRank nullRank = (NullRank) o;
        
        return ((getHighValue() == nullRank.getHighValue()) &&
                (getLowValue() == nullRank.getLowValue()));
    }
    
}
