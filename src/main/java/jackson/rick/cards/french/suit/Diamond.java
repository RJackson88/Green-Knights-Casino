package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public class Diamond implements Suit {
    private String suit;
    private String symbol;
    private String color;
    private String blackSymbol;
    private String whiteSymbol;
    private String highValue;
    private String lowValue;
    
    public Diamond() {
        this.suit = "Diamond";
        this.symbol = "♦";
        this.color = "Red";
        this.blackSymbol = "♦";
        this.whiteSymbol = "♢";
        this.highValue = "d";
        this.lowValue = "d";
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
    
    public String getHighValue() {
        return this.highValue;
    }
    
    public String getLowValue() {
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
    
    public void setHighValue(String highValue) {
        this.highValue = highValue;
    }
    
    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(String highValue, String lowValue) {
        this.highValue = highValue;
        this.lowValue = lowValue;
    }
    
    public void restoreDefaults() {
        this.suit = "Diamond";
        this.symbol = "♦";
        this.color = "Red";
        this.blackSymbol = "♦";
        this.whiteSymbol = "♢";
        this.highValue = "d";
        this.lowValue = "d";
    }
}
