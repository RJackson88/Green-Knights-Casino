package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Four extends Rank {
    
    public Four() {
        
    }
    
    public Four(String index) {
        super(index);
    }
    
    public Four(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Four(int value) {
        super(value);
    }
    
    public Four(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "4";
        alternateIndex = "";
        type = "Face";
        highValue = 4;
        lowValue = 4;
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
