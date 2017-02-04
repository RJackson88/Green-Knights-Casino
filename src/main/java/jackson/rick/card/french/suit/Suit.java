package jackson.rick.card.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
interface Suit {
    
    String suit();
    
    String pip();
    
    String blackPip();
    
    String whitePip();
    
    int highValue();
    
    int lowValue();
    
    void setSuit(String suit);
    
    void setPip(String pip);
    
    void setToBlackPip();
    
    void setToWhitePip();
    
    void setBlackPip(String pip);
    
    void setWhitePip(String pip);
    
    void setHighValue(int highValue);
    
    void setLowValue(int lowValue);
    
    void setValues(int highValue, int lowValue);
    
    void restoreDefaults();
}
