/**
 * Created by rickjackson on 2/17/17.
 */
package jackson.rick.cards.french.rank;

public abstract class AbstractTest {
    private int privateField;
    int defaultField;
    protected int protectedField;
    public int publicField;
    public int initializeFinalField;
    
    public AbstractTest() {
        privateField = 0;
        defaultField = 0;
        protectedField = 0;
        publicField = 0;
    }
    
    public AbstractTest(int i) {
        privateField = i;
    }
    
    public abstract int abstractMethod();
    
    public int publicMethod() {
        return 1;
    }
    
    private int privateMethod() {
        return privateField;
    }
    
    int defaultMethod() {
        return defaultField;
    }
    
    public int getPrivateField() {
        return privateField;
    }
    
    
}
