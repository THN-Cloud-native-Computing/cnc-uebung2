import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {
    @Test
    public void testFactorial() {
        assertEquals(1, FactorialCalculator.factorial(0));
        assertEquals(1, FactorialCalculator.factorial(1));
        assertEquals(2, FactorialCalculator.factorial(2));
        assertEquals(6, FactorialCalculator.factorial(3));
        assertEquals(24, FactorialCalculator.factorial(4));
        assertEquals(120, FactorialCalculator.factorial(5));
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        FactorialCalculator.factorial(-5);
    }
}
