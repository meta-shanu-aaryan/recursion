import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LcmHcfTest {
    MathCalculation mc;

    @BeforeEach
    public void initObj() {
        mc = new MathCalculation();
    }

    @Test
    public void TestLcm() {
        // MathCalculation mc = new MathCalculation();

        assertEquals(30, mc.calculateLcm(5, 6, 0));
        assertEquals(40, mc.calculateLcm(10, 8, 0));
        assertEquals(120, mc.calculateLcm(120, 60, 0));
        assertEquals(80, mc.calculateLcm(80, 2, 0));
    }

    @Test
    public void TestHcf() {
        assertEquals(1, mc.calculateHcf(9, 8));
        assertEquals(10, mc.calculateHcf(40, 50));
        assertEquals(50, mc.calculateHcf(50, 500));
    }
}
