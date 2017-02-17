/**
 * Created by rickjackson on 2/17/17.
 */
package jackson.rick.cards.french.rank;

public class ATest {
    
    public static void main(String[] args) {
        AbstractTest at = new ClassTest();
        ClassTest ct = new ClassTest(10);
        AbstractTest at2 = new AbstractTest(1000) {
            @Override
            public int abstractMethod() {
                return 0;
            }
        };
    
        System.out.println(at.defaultField);
        System.out.println(at.getPrivateField());
        System.out.println(ct.getPrivateField());
        System.out.println(at2.getPrivateField());
        System.out.println();
    }
}
