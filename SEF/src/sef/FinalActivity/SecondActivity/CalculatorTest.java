package sef.FinalActivity.SecondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    @Override
    public void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testAdditionSuccess() {
        Integer a = 20;
        Integer b = 10;
        assertEquals(30, (calculator.addition(a, b)));
        assertEquals(30, (calculator.addition(b, a)));

        a = -1;
        b = 1;
        assertEquals(0, (calculator.addition(a, b)));
        assertEquals(0, (calculator.addition(b, a)));

        a = -1;
        b = -5;
        assertEquals(-6, (calculator.addition(a, b)));
        assertEquals(-6, (calculator.addition(b, a)));

        a = 1000;
        b = 0;
        assertEquals(1000, (calculator.addition(a, b)));
        assertEquals(1000, (calculator.addition(b, a)));
    }

    public void testAdditionFailed(){
        Integer a = null;
        Integer b = 10;
        try {
            calculator.addition(a, b);
        }catch(NullPointerException ex){
            assertTrue(!ex.getMessage().equals(""));
        }
    }

    public void testSubtractionSuccess() {
        int a = 20;
        int b = 10;
        assertEquals(10, (calculator.subtraction(a, b)));
        assertEquals(-10, (calculator.subtraction(b, a)));

        a = -1;
        b = -1;
        assertEquals(0, (calculator.subtraction(a, b)));
        assertEquals(0, (calculator.subtraction(b, a)));

        a = 1;
        b = -5;
        assertEquals(6, (calculator.subtraction(a, b)));
        assertEquals(-6, (calculator.subtraction(b, a)));

        a = 1000;
        b = 0;
        assertEquals(1000, (calculator.subtraction(a, b)));
        assertEquals(-1000, (calculator.subtraction(b, a)));
    }
    public void testSubtractionFailed(){
        Integer a = null;
        Integer b = 10;
        try {
            calculator.subtraction(a, b);
        }catch(NullPointerException ex){
            assertTrue(!ex.getMessage().equals(""));
        }
    }

    public void testMultiplication() {
        double a = 20;
        double b = 10;
        assertEquals(200, (calculator.multiplication(a, b)), 0);
        assertEquals(200, (calculator.multiplication(b, a)), 0);

        a = -1;
        b = -1;
        assertEquals(1, (calculator.multiplication(a, b)), 0);
        assertEquals(1, (calculator.multiplication(b, a)), 0);

        a = 1;
        b = -5;
        assertEquals(-5, (calculator.multiplication(a, b)), 0);
        assertEquals(-5, (calculator.multiplication(b, a)), 0);

        a = 10000;
        b = 0;
        assertEquals(0, (calculator.multiplication(a, b)), 0);
        assertEquals(0, (calculator.multiplication(b, a)), 0);

    }

    public void testDivision() {
        double a = 20;
        double b = 10;
        assertEquals(2, (calculator.division(a, b)), 0);
        assertEquals(0.5, (calculator.division(b, a)), 0);

        a = -1;
        b = -100;
        assertEquals(0.01, (calculator.division(a, b)), 0);
        assertEquals(100, (calculator.division(b, a)), 0);

        a = 1;
        b = -5;
        assertEquals(-0.2, (calculator.division(a, b)), 0);
        assertEquals(-5, (calculator.division(b, a)), 0);

        a = 7000;
        b = 0;
        assertEquals(0, (calculator.division(a, b)), 0);
        assertEquals(0, (calculator.division(b, a)), 0);

    }
}
