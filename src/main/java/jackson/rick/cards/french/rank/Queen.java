package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Queen extends Rank {
    
    public Queen() {
        
    }
    
    public Queen(String index) {
        super(index);
    }
    
    public Queen(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Queen(int value) {
        super(value);
    }
    
    public Queen(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "Q";
        alternateIndex = "";
        type = "Face";
        highValue = 12;
        lowValue = 12;
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
        if (!(o instanceof Queen)) return false;
    
        Queen queen = (Queen) o;
        
        return ((getHighValue() == queen.getHighValue()) &&
                (getLowValue() == queen.getLowValue()));
    }
}
