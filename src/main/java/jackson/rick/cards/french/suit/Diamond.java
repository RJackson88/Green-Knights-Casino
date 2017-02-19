package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Diamond extends Suit {
    
    public Diamond() {
        
    }
    
    public Diamond(String symbol) {
        super(symbol);
    }
    
    public Diamond(String symbol, String color) {
        super(symbol, color);
    }
    
    public Diamond(int value) {
        super(value);
    }
    
    public Diamond(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        symbol = "♦";
        color = "Red";
        alternateColor = "Blue";
        blackSymbol = "♦";
        whiteSymbol = "♢";
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
        if (!(o instanceof Club)) return false;
        
        Club club = (Club) o;
        
        return ((getHighValue() == club.getHighValue()) &&
                (getLowValue() == club.getLowValue()));
    }
}
