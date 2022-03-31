package sef.FinalActivity.SecondActivity;

public class Calculator {

    public int addition(Integer a, Integer b) throws NullPointerException{
        if (validateNotNull(a,b)) {
            return a + b;
        } else {
            throw new NullPointerException("Invalid input data");
        }
    }

    public int subtraction(Integer a, Integer b) throws NullPointerException {

        if (validateNotNull(a,b)) {
            return a - b;
        } else {
            throw new NullPointerException("Invalid input data");
        }
    }

    private boolean validateNotNull(Integer a, Integer b) {
        if (a != null && b != null) {
            return true;
        } else {
            return false;
        }
    }

    public double multiplication(double a, double b) throws ArithmeticException {
        try {
            if ((a == 0) || (b == 0)) {
                throw new ArithmeticException("Multiplication by 0 will be always 0");
            }
            return a * b;
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
            return 0;
        }
    }


    public double division(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by 0 is not allowed");
            }
            return a / b;
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
            return 0;
        }
    }
}
