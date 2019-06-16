package js.compressor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cost_Calculator_Test {

    private static final double DELTA = 1E-02;

    @Test
    public void test_calculate() {
        Cost_Calculator cc = new Cost_Calculator(0.2);
        assertEquals(2.0, cc.calculate(10), DELTA);
    }
}
