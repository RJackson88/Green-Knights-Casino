package jackson.rick.cards.french.rank;

import java.util.Comparator;

/**
 * Created by rickjackson on 2/18/17.
 */
public abstract class Rank implements Comparable<Rank>, Comparator<Rank> {
    // Map<String, Object> properties = new HashMap<>();
    String index;
    String alternateIndex;
    String type;
    int highValue;
    int lowValue;
    boolean wild;
    
    public Rank() {
        setDefaultProperties();
    }
    
    public Rank(String index) {
        this();
        setIndex(index);
    }
    
    public Rank(String index, String alternateIndex) {
        this(index);
        setAlternateIndex(alternateIndex);
    }
    
    public Rank(int value) {
        this(value, value);
    }
    
    public Rank(int highValue, int lowValue) {
        this();
        setValues(highValue, lowValue);
    }
    
    
    // Query and Modification Operations
    
    String getIndex() {
        return index;
    }
    
    void setIndex(String index) {
        this.index = index;
    }
    
    String getAlternateIndex() {
        return alternateIndex;
    }
    
    void setAlternateIndex(String index) {
        this.alternateIndex = alternateIndex;
    }
    
    String getType() {
        return type;
    }
    
    void setType(String type) {
        this.type = type;
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
    
    void setIndexToAlternate() {
        setIndex(alternateIndex);
    }
    
    void restoreDefaults() {
        setDefaultProperties();
    }
    
    public void setValues(int value) {
        setHighValue(value);
        setLowValue(value);
    }
    
    void setValues(int highValue, int lowValue) {
        setHighValue(highValue);
        setLowValue(lowValue);
    }
    
    abstract void setDefaultProperties();
    
    void setToNullValues() {
        index = "";
        alternateIndex = "";
        type = "";
        highValue = 0;
        lowValue = 0;
        wild = false;
    }
    
    
    // Comparison and Hashing
    
    @Override
    public int hashCode() {
        int result = ((toString() == "") ? 0 : toString().hashCode());
        result = 31 * result + getHighValue();
        result = 31 * result + getLowValue();
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rank)) return false;
        
        Rank rank = (Rank) o;
        
        return ((getHighValue() == rank.getHighValue()) &&
                (getLowValue() == rank.getLowValue()));
    }
    
    public int compareTo(Rank rank) {
        return (getClass().getSimpleName()).compareTo(rank.getClass()
                                                          .getSimpleName());
    }
    
    public int compare(Rank rank1, Rank rank2) {
        return (rank1.getHighValue() == rank2.getHighValue())
               ? (rank2.getLowValue() - rank1.getLowValue())
               : (rank2.getHighValue() - rank1.getLowValue());
    }
    
    
    // String Conversion
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public String index() {
        return getIndex();
    }
    
}
