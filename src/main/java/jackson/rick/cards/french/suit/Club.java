/**
 * Created by rickjackson on 2/4/17.
 */
package jackson.rick.cards.french.suit;

public class Club implements Suit {
    public String suit;
    private String symbol;
    private String color;
    private String altColor;
    private String blackSymbol;
    private String whiteSymbol;
    private String highValue;
    private String lowValue;
    
    public Club() {
        this.suit = "Club";
        this.symbol = "♣";
        this.color = "Black";
        this.altColor = "Green";
        this.blackSymbol = "♣";
        this.whiteSymbol = "♧";
        this.highValue = "c";
        this.lowValue = "c";
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
    
    public String getHighValue() {
        return highValue;
    }
    
    public void setHighValue(String highValue) {
        this.highValue = highValue;
    }
    
    public String getLowValue() {
        return lowValue;
    }
    
    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(String highValue, String lowValue) {
        this.highValue = highValue;
        this.lowValue = lowValue;
    }
    
    public void restoreDefaults() {
        this.suit = "Club";
        this.symbol = "♣";
        this.color = "Black";
        this.blackSymbol = "♣";
        this.whiteSymbol = "♧";
        this.highValue = "c";
        this.lowValue = "c";
    }
}
