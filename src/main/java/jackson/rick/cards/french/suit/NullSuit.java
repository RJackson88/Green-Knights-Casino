package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/20/17.
 */
public class NullSuit extends Suit {
    
    public NullSuit() {
        super();
    }
    
    public NullSuit(String symbol) {
        super(symbol);
    }
    
    public NullSuit(String symbol, String color) {
        super(symbol, color);
    }
    
    public NullSuit(int value) {
        super(value);
    }
    
    public NullSuit(int highValue, int lowValue) {
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
        if (!(o instanceof NullSuit)) return false;
        
        NullSuit nullSuit = (NullSuit) o;
        
        return ((getHighValue() == nullSuit.getHighValue()) &&
                (getLowValue() == nullSuit.getLowValue()));
    }
}
