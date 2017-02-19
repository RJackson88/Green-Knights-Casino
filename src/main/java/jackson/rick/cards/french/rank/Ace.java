package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Ace extends Rank {
    
    public Ace() {
        
    }
    
    public Ace(String index) {
        super(index);
    }
    
    public Ace(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Ace(int value) {
        super(value);
    }
    
    public Ace(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "A";
        alternateIndex = "";
        type = "Face";
        highValue = 14;
        lowValue = 1;
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
        if (!(o instanceof Ace)) return false;
        
        Ace ace = (Ace) o;
        
        return ((getHighValue() == ace.getHighValue()) &&
                (getLowValue() == ace.getLowValue()));
    }
}
