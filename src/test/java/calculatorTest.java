// Imported the necessary junit imports
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * The calculatorTest class is a class built to test the calculator class, this class has 
 * multiple methods with each method testing/checking if a method in the calculator class works correctly. 
 */
public class calculatorTest {
	// Tests the add method, this checks if 3 + 4 = 7.
    @Test
    public void testAdd() {
      calculator calc = new calculator();
        assertEquals(7.0, calc.add(3, 4));
    }

    // Tests the subtract method, this checks if 10 - 3 = 7.
    @Test
    public void testSubtract() {
        calculator calc = new calculator();
        assertEquals(7.0, calc.subtract(10, 3));
    }

    // Tests the multiply method, this checks if 3 * 4 = 12.
    @Test
    public void testMultiply() {
        calculator calc = new calculator();
        assertEquals(12.0, calc.multiply(3, 4));
    }

    // Tests the divide method, checks if 10 / 4 = 2.5.
    @Test
    public void testDivide() {
        calculator calc = new calculator();
        assertEquals(2.5, calc.divide(10, 4));
    }

    // Tests dividing by zero, this throws an exception.
    @Test
    public void testDivideByZero() {
    	calculator calc = new calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }

     // Tests the power method, this checks if 2^3 = 8.
    @Test
    public void testPower() {
    	calculator calc = new calculator();
        assertEquals(8.0, calc.power(2, 3));
    }

    //Tests negative exponent for power. hould throw an exception.
    @Test
    public void testNegativePower() {
    	calculator calc = new calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.power(2, -1));
    }

     // Tests the square root method, this checks if sqrt(9) = 3.
    @Test
    public void testSqrt() {
    	calculator calc = new calculator();
        assertEquals(3.0, calc.sqrt(9));
    }

    // Tests square root of a negative number, this should throw an exception.
    @Test
    public void testNegativeSqrt() {
    	calculator calc = new calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.sqrt(-1));
    }
}
