package sef.module2.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtraction
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Addition
		result = i+j;
		
		// Print result
		System.out.println("Summ is: " + result);

		// Division
		result = i/j;
		System.out.println("Quotient is:" + result);

		//Multiplication
		result = i*j;
		System.out.println("Product is:" + result);

		//Modulo
		result = i%j;
		System.out.println("Remainder is:" + result);
	}

}
