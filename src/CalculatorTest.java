import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void tenMinusFiveShouldEqualFive(){
        Calculator calculator = new Calculator();
        assertEquals(5, Calculator.subtraction(10,5));
    }

    @Test
    void twelveMinusThreeShouldEqualNine(){
        Calculator calculator = new Calculator();
        assertEquals(9,Calculator.subtraction(12,3));
    }

    @Test
    void fourTimesEightShouldEqualThirtyTwo() {
        Calculator calculator = new Calculator();
        assertEquals(32,Calculator.multiplication(4,8));
    }

    @Test
    void twoTimesZeroShouldEqualZero() {
        Calculator calculator = new Calculator();
        assertEquals(0,Calculator.multiplication(2,0));
    }
}
