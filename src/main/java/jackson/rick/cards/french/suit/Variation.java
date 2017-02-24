package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/23/17.
 */
public class Variation extends Suit {
    
    public Variation() {
        
    }
    
    public Variation(String symbol) {
        super(symbol);
    }
    
    public Variation(String symbol, String color) {
        super(symbol, color);
    }
    
    public Variation(int value) {
        super(value);
    }
    
    public Variation(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        // symbol = "♣";
        // color = "Black";
        // alternateColor = "Green";
        // blackSymbol = "♣";
        // whiteSymbol = "♧";
        // highValue = 1;
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
        if (!(o instanceof Variation)) return false;
        
        Variation var = (Variation) o;
        
        return ((getHighValue() == var.getHighValue()) &&
                (getLowValue() == var.getLowValue()));
    }
}
