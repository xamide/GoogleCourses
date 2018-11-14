import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    @Test
    void sumNumbers() {
        SumOfNumbers sum = new SumOfNumbers();
        assertEquals(0, sum.sumNumbers(""));
        assertEquals(0, sum.sumNumbers("Chocolate"));
        assertEquals(123, sum.sumNumbers("abc123xyz"));
        assertEquals(44, sum.sumNumbers("aa11b33"));
        assertEquals(18, sum.sumNumbers("7 11"));
    }
}