package sef.module7.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			throw new IllegalArgumentException("You shall not set age below 0");
		}
	}
	
	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		setAge(-2);
	}
}
