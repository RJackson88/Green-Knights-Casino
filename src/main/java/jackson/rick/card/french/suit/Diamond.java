package jackson.rick.card.french.suit;

/**
 * Created by rickjackson on 2/4/17.
 */
class Diamond implements Suit {
    private String suit;
    private String pip;
    private String blackPip;
    private String whitePip;
    private int highValue;
    private int lowValue;
    
    Diamond() {
        this.suit = "Diamond";
        this.pip = "♦";
        this.blackPip = "♦";
        this.whitePip = "♢";
        this.highValue = 2;
        this.lowValue = 2;
    }
    
    public String suit() {
        return this.suit;
    }
    
    public String pip() {
        return this.pip;
    }
    
    public String blackPip() {
        return this.blackPip;
    }
    
    public String whitePip() {
        return this.whitePip;
    }
    
    public int highValue() {
        return this.highValue;
    }
    
    public int lowValue() {
        return this.lowValue;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public void setPip(String pip) {
        this.pip = pip;
    }
    
    public void setToBlackPip() {
        this.pip = this.blackPip;
    }
    
    public void setToWhitePip() {
        this.pip = this.whitePip;
    }
    
    public void setBlackPip(String pip) {
        this.blackPip = pip;
    }
    
    public void setWhitePip(String pip) {
        this.whitePip = pip;
    }
    
    public void setHighValue(int highValue) {
        this.highValue = highValue;
    }
    
    public void setLowValue(int lowValue) {
        this.lowValue = lowValue;
    }
    
    public void setValues(int highValue, int lowValue) {
        this.highValue = highValue;
        this.lowValue = lowValue;
    }
    
    public void restoreDefaults() {
        this.suit = "Diamond";
        this.pip = "♦";
        this.blackPip = "♦";
        this.whitePip = "♢";
        this.highValue = 2;
        this.lowValue = 2;
    }
}
