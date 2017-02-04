package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
class Spade implements Suit {
    private String suit;
    private String symbol;
    private String color;
    private String blackSymbol;
    private String whiteSymbol;
    private int highValue;
    private int lowValue;
    
    Spade() {
        this.suit = "Spade";
        this.symbol = "♠";
        this.color = "Black";
        this.blackSymbol = "♠";
        this.whiteSymbol = "♤";
        this.highValue = 4;
        this.lowValue = 4;
    }
    
    public String toString() {
        return this.suit;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String getBlackSymbol() {
        return this.blackSymbol;
    }
    
    public String getWhiteSymbol() {
        return this.whiteSymbol;
    }
    
    public int getHighValue() {
        return this.highValue;
    }
    
    public int getLowValue() {
        return this.lowValue;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setToBlackSymbol() {
        this.symbol = this.blackSymbol;
    }
    
    public void setToWhiteSymbol() {
        this.symbol = this.whiteSymbol;
    }
    
    public void setBlackSymbol(String symbol) {
        this.blackSymbol = symbol;
    }
    
    public void setWhiteSymbol(String symbol) {
        this.whiteSymbol = symbol;
    }
    
    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }
    
    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(int highValue, int lowValue) {
        this.highValue = highValue;
        this.lowValue = lowValue;
    }
    
    public void restoreDefaults() {
        this.suit = "Spade";
        this.symbol = "♠";
        this.color = "Black";
        this.blackSymbol = "♠";
        this.whiteSymbol = "♤";
        this.highValue = 4;
        this.lowValue = 4;
    }
}
