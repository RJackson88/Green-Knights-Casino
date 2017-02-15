package jackson.rick.cards.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
public interface Suit {
    
    @Override
    String toString();
    
    void setSuit(String suit);
    
    String getSymbol();
    
    void setSymbol(String symbol);
    
    String getColor();
    
    void setColor(String color);
    
    String getBlackSymbol();
    
    void setToBlackSymbol();
    
    void setBlackSymbol(String symbol);
    
    String getWhiteSymbol();
    
    void setToWhiteSymbol();
    
    void setWhiteSymbol(String symbol);
    
    String getHighValue();
    
    void setHighValue(String highValue);
    
    String getLowValue();
    
    void setLowValue(String lowValue);
    
    void setValues(String highValue, String lowValue);
    
    void restoreDefaults();
}
