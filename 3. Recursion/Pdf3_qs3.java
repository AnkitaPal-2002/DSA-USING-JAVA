/*
 * 3. Write a recursive function to calculate the power of a two number(consider the degree as a
negative/positive integer).
 */


package Pdf3;

public class Pdf3_qs3 {

	public static double power(double base, int exponent) {
		if(exponent == 0)
			return 1;
		else if(exponent>0)
			return base * power(base, exponent-1);
		else
			return 1/(base * power(base, -exponent-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base = 2;
		int exponent = -3;
		
		System.out.println("Result = "+power(base, exponent));
	}

}

/*
 * Output:
 * Result = 0.125

 * 
 * 
 * */
