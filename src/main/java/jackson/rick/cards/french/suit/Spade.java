package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Spade extends Suit {
    
    public Spade() {
        
    }
    
    public Spade(String symbol) {
        super(symbol);
    }
    
    public Spade(String symbol, String color) {
        super(symbol, color);
    }
    
    public Spade(int value) {
        super(value);
    }
    
    public Spade(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        symbol = "♠";
        color = "Black";
        alternateColor = "Black";
        blackSymbol = "♠";
        whiteSymbol = "♤";
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
        if (!(o instanceof Spade)) return false;
        
        Spade spade = (Spade) o;
        
        return ((getHighValue() == spade.getHighValue()) &&
                (getLowValue() == spade.getLowValue()));
    }
}
