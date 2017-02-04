package jackson.rick.cards.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
public interface Rank {
    
    @Override
    String toString();
    
    String getIndex();
    
    String getType();
    
    int getHighValue();
    
    int getLowValue();
    
    void setRank(String rank);
    
    void setIndex(String index);
    
    void setType(String type);
    
    void setHighValue(int highValue);
    
    void setLowValue(int lowValue);
    
    void setValues(int highValue, int lowValue);
    
    void restoreDefaults();
}
