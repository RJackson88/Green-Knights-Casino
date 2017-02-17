/**
 * Created by rickjackson on 2/17/17.
 */
package jackson.rick.cards.french.rank;

public class ClassTest extends AbstractTest {
    public int newField;
    int defaultField = 100;
    public static final int psfField = 0;
    
    public ClassTest() {
        newField = super.getPrivateField();
    }
    
    public ClassTest(int i) {
        super(i);
    }
    
    @Override
    public int abstractMethod() {
        return super.getPrivateField();
    }
    
    public final int psfMethod() {
        return newField;
    }
    
    int ctDefaultMethod() {
        return defaultField;
    }
}
