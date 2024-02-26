/*
 * 1. Write a recursive function to calculate the gcd of two numbers.
 */

package Pdf3;
class GCD{
	public static int findgcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return findgcd(num2, num1%num2);
	}
}
public class Pdf3_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 36;
		int num2 = 42;
		
		int gcd = GCD.findgcd(num1, num2);
		System.out.println("GCD = "+gcd);
		
	}

}


/*Output
 * 
 * GCD = 6

 * */
 