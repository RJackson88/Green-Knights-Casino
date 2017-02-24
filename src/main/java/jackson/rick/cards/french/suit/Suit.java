package jackson.rick.cards.french.suit;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/4/17.
 */
public abstract class Suit implements Comparable<Suit>, Comparator<Suit> {
    // Map<String, Object> properties = new HashMap<>();
    String symbol;
    String color;
    String alternateColor;
    String blackSymbol;
    String whiteSymbol;
    int highValue;
    int lowValue;
    boolean wild;
    
    public Suit() {
        setDefaultProperties();
    }
    
    public Suit(String symbol) {
        this();
        setSymbol(symbol);
    }
    
    public Suit(String symbol, String color) {
        this(symbol);
        setColor(color);
    }
    
    public Suit(int value) {
        this(value, value);
    }
    
    public Suit(int highValue, int lowValue) {
        this();
        setValues(highValue, lowValue);
    }
    
    
    // Query and Modification Operations
    
    String getSymbol() {
        return symbol;
    }
    
    void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    String getColor() {
        return color;
    }
    
    void setColor(String color) {
        this.color = color;
    }
    
    String getAlternateColor() {
        return alternateColor;
    }
    
    void setAlternateColor(String color) {
        this.alternateColor = color;
    }
    
    String getBlackSymbol() {
        return blackSymbol;
    }
    
    void setBlackSymbol(String symbol) {
        this.blackSymbol = symbol;
    }
    
    String getWhiteSymbol() {
        return whiteSymbol;
    }
    
    void setWhiteSymbol(String symbol) {
        this.whiteSymbol = symbol;
    }
    
    public int getHighValue() {
        return highValue;
    }
    
    public void setHighValue(int value) {
        this.highValue = value;
    }
    
    public void setHighValueToLowValue() {
        this.highValue = this.lowValue;
    }
    
    public int getLowValue() {
        return lowValue;
    }
    
    public void setLowValue(int value) {
        this.lowValue = value;
    }
    
    public void setLowValueToHighValue() {
        this.lowValue = this.highValue;
    }
    
    public boolean getWildStatus() {
        return wild;
    }
    
    public void setWild(boolean wild) {
        this.wild = wild;
    }
    
    public boolean isWild() {
        return wild;
    }
    
    
    // Bulk Operations
    
    void setSymbolToBlack() {
        setSymbol(blackSymbol);
    }
    
    void setSymbolToWhite() {
        setSymbol(whiteSymbol);
    }
    
    void setColorToAlternate() {
        setColor(alternateColor);
    }
    
    void restoreDefaults() {
        setDefaultProperties();
    }
    
    public void setValues(int value) {
        setHighValue(value);
        setLowValue(value);
    }
    
    public void setValues(int highValue, int lowValue) {
        setHighValue(highValue);
        setLowValue(lowValue);
    }
    
    abstract void setDefaultProperties();
    
    void setToNullValues() {
        symbol = "";
        color = "";
        alternateColor = "";
        blackSymbol = "";
        whiteSymbol = "";
        highValue = 0;
        lowValue = 0;
        wild = false;
    }
    
    
    // Comparison and Hashing
    
    @Override
    public int hashCode() {
        int result = ((toString().equals("")) ? 0 : (toString().hashCode()));
        result = 31 * result + getHighValue();
        result = 31 * result + getLowValue();
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suit)) return false;
        
        Suit suit = (Suit) o;
        
        return (this.getHighValue() == suit.getHighValue());
    }
    
    @Override
    public int compareTo(Suit suit) {
        return (suit.getHighValue() - this.getHighValue());
    }
    
    @Override
    public int compare(Suit suit1, Suit suit2) {
        return (suit2.getHighValue() - suit1.getHighValue());
    }
    
    
    // String Conversion
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public String symbol() {
        return getSymbol();
    }
}
