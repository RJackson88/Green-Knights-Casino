package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Two extends Rank {
    
    public Two() {
        
    }
    
    public Two(String index) {
        super(index);
    }
    
    public Two(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Two(int value) {
        super(value);
    }
    
    public Two(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "2";
        alternateIndex = "";
        type = "Pip";
        highValue = 2;
        lowValue = 2;
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
        if (!(o instanceof Two)) return false;
        
        Two two = (Two) o;
        
        return ((getHighValue() == two.getHighValue()) &&
                (getLowValue() == two.getLowValue()));
    }
}
