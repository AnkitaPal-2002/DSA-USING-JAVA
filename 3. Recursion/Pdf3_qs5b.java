/*
 * 5. Write a recursive function to find the sum of the following series.
 * 
 * (b) S= 1^2- 3^2+ 5^2- 7^2+.......+ N (Input N).
 */

package Pdf3;

public class Pdf3_qs5b {
	public static double sum(int n) {
		if (n == 1)
			return 1;
		else {
			double term = Math.pow(((2*n)-1), 2);
			double sign = Math.pow(-1,(n-1));
			double res = term*sign;
			return res+sum(n-1);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		System.out.println("result : "+sum(n));

	}

}

/*Output
 * result : 17.0

 * 
 */
