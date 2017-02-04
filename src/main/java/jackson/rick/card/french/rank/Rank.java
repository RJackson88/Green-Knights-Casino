package jackson.rick.card.french.rank;

/**
 * Created by rickjackson on 2/3/17.
 */
interface Rank {
    
    String rank();
    
    String index();
    
    int highValue();
    
    int lowValue();
    
    void setRank(String rank);
    
    void setIndex(String index);
    
    void setHighValue(int highValue);
    
    void setLowValue(int lowValue);
    
    void setValues(int highValue, int lowValue);
    
    void restoreDefaults();
}
