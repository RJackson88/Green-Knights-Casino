package jackson.rick.token;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 1/31/17.
 */
public class Denomination {
    private Map<String, Double> commonValues;

    Denomination() {
        commonValues = new HashMap<>();
        constructCommonValues();
    }

    private void constructCommonValues() {
        commonValues.put("0.01", 0.01);
        commonValues.put("0.05", 0.05);
        commonValues.put("0.10", 0.10);
        commonValues.put("0.25", 0.25);
        commonValues.put("0.50", 0.50);
        commonValues.put("1", 1.00);
        commonValues.put("2", 2.00);
        commonValues.put("2.50", 2.50);
        commonValues.put("4", 4.00);
        commonValues.put("5", 5.00);
        commonValues.put("10", 10.00);
        commonValues.put("25", 25.00);
        commonValues.put("50", 50.00);
        commonValues.put("100", 100.00);
        commonValues.put("250", 250.00);
        commonValues.put("500", 500.00);
        commonValues.put("1000", 1000.00);
        commonValues.put("2000", 2000.00);
        commonValues.put("5000", 5000.00);
        commonValues.put("25000", 25000.00);
        commonValues.put("100000", 100000.00);
        commonValues.put("250000", 250000.00);
        commonValues.put("500000", 500000.00);
        commonValues.put("1000000", 1000000.00);
    }
}
