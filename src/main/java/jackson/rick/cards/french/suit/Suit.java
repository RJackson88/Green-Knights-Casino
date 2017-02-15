package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public interface Suit {
    
    @Override
    String toString();
    
    String getSymbol();
    
    String getColor();
    
    String getBlackSymbol();
    
    String getWhiteSymbol();
    
    String getHighValue();
    
    String getLowValue();
    
    void setSuit(String suit);
    
    void setSymbol(String symbol);
    
    void setColor(String color);
    
    void setToBlackSymbol();
    
    void setToWhiteSymbol();
    
    void setBlackSymbol(String symbol);
    
    void setWhiteSymbol(String symbol);
    
    void setHighValue(String highValue);
    
    void setLowValue(String lowValue);
    
    void setValues(String highValue, String lowValue);
    
    void restoreDefaults();
}
