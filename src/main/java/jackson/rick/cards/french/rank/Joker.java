package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public class Joker extends Rank {
    
    public Joker() {
        
    }
    
    public Joker(String index) {
        super(index);
    }
    
    public Joker(String index, String alternateIndex) {
        super(index, alternateIndex);
    }
    
    public Joker(int value) {
        super(value);
    }
    
    public Joker(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        index = "Jkr";
        alternateIndex = "";
        type = "Wild";
        highValue = 0;
        lowValue = 0;
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
        if (!(o instanceof Joker)) return false;
        
        Joker joker = (Joker) o;
        
        return ((getHighValue() == joker.getHighValue()) &&
                (getLowValue() == joker.getLowValue()));
    }
}
