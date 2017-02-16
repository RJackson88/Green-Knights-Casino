package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Diamond implements Suit {
    private String suit;
    private String symbol;
    private String color;
    private String altColor;
    private String blackSymbol;
    private String whiteSymbol;
    private int highValue;
    private int lowValue;
    
    public Diamond() {
        this.suit = "Diamond";
        this.symbol = "♦";
        this.color = "Red";
        this.altColor = "Blue";
        this.blackSymbol = "♦";
        this.whiteSymbol = "♢";
        this.highValue = 2;
        this.lowValue = 2;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diamond)) return false;
        
        Diamond diamond = (Diamond) o;
        
        return (getHighValue() != diamond.getHighValue() ||
                getLowValue() != diamond.getLowValue()) &&
                suit.equals(diamond.suit);
    }
    
    @Override
    public int hashCode() {
        int result = ((suit == null) ? 0 : suit.hashCode());
        result = 31 * result + getHighValue();
        result = 31 * result + getLowValue();
        return result;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getAltColor() {
        return altColor;
    }
    
    public void setAltColor(String color) {
        this.altColor = color;
    }
    
    public String getBlackSymbol() {
        return blackSymbol;
    }
    
    public void setToBlackSymbol() {
        this.symbol = this.blackSymbol;
    }
    
    public void setBlackSymbol(String symbol) {
        this.blackSymbol = symbol;
    }
    
    public String getWhiteSymbol() {
        return whiteSymbol;
    }
    
    public void setToWhiteSymbol() {
        this.symbol = this.whiteSymbol;
    }
    
    public void setWhiteSymbol(String symbol) {
        this.whiteSymbol = symbol;
    }
    
    public int getHighValue() {
        return highValue;
    }
    
    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }
    
    public int getLowValue() {
        return lowValue;
    }
    
    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(int highValue, int lowValue) {
        this.highValue = highValue;
        this.lowValue = lowValue;
    }
    
    public void restoreDefaults() {
        this.suit = "Diamond";
        this.symbol = "♦";
        this.color = "Red";
        this.altColor = "Blue";
        this.blackSymbol = "♦";
        this.whiteSymbol = "♢";
        this.highValue = 2;
        this.lowValue = 2;
    }
}
