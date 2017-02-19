package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public interface OldSuit {
    
    void setSuit(String suit);
    
    String getSymbol();
    
    void setSymbol(String symbol);
    
    String getColor();
    
    void setColor(String color);
    
    String getAltColor();
    
    void setAltColor(String color);
    
    String getBlackSymbol();
    
    void setToBlackSymbol();
    
    void setBlackSymbol(String symbol);
    
    String getWhiteSymbol();
    
    void setToWhiteSymbol();
    
    void setWhiteSymbol(String symbol);
    
    int getHighValue();
    
    void setHighValue(int highValue);
    
    int getLowValue();
    
    void setLowValue(int lowValue);
    
    void setValues(int highValue, int lowValue);
    
    void restoreDefaults();
}
