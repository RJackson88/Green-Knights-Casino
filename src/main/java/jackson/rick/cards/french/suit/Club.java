package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Club extends Suit {
    
    public Club() {
        
    }
    
    public Club(String symbol) {
        super(symbol);
    }
    
    public Club(String symbol, String color) {
        super(symbol, color);
    }
    
    public Club(int value) {
        super(value);
    }
    
    public Club(int highValue, int lowValue) {
        super(highValue, lowValue);
    }
    
    
    // Bulk Operations
    
    void setDefaultProperties() {
        symbol = "♣";
        color = "Black";
        alternateColor = "Green";
        blackSymbol = "♣";
        whiteSymbol = "♧";
        highValue = 1;
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
        if (!(o instanceof Club)) return false;
        
        Club club = (Club) o;
        
        return ((getHighValue() == club.getHighValue()) &&
                (getLowValue() == club.getLowValue()));
    }
}
