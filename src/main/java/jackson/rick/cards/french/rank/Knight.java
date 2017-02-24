package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/23/17.
 */
public class Knight extends Rank {
    
    public Knight() {
        
    }
    
    public Knight(String index) {
        super(index);
    }
    
    public Knight(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Knight(int value) {
        super(value);
    }
    
    public Knight(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        // index = "A";
        // alternateIndex = "";
        // type = "Face";
        // highValue = 14;
        // lowValue = 1;
        // wild = false;
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
        if (!(o instanceof Knight)) return false;
        
        Knight knight = (Knight) o;
        
        return ((getHighValue() == knight.getHighValue()) &&
                (getLowValue() == knight.getLowValue()));
    }
}
