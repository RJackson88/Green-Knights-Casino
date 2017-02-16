/**
 * Created by rickjackson on 2/3/17.
 */
package jackson.rick.cards.french.rank;

public interface Rank {
    
    void setRank(String rank);
    
    String getIndex();
    
    void setIndex(String index);
    
    String getAltIndex();
    
    void setAltIndex(String index);
    
    String getType();
    
    void setType(String type);
    
    int getHighValue();
    
    void setHighValue(int highValue);
    
    int getLowValue();
    
    void setLowValue(int lowValue);
    
    void setValues(int highValue, int lowValue);
    
    void setValues(int value);
    
    void restoreDefaults();
}
