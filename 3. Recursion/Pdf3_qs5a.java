/*
 * 5. Write a recursive function to find the sum of the following series.

(a) S= 2 + 4 + 6 + 8 + . . . . . + N (Input N).
 */

package Pdf3;
import java.util.*;
public class Pdf3_qs5a {
	public static int sum(int n) {
		if(n==1)
			return (2*n);
		else
			return (2*n) + sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n : ");
		int n = sc.nextInt();
		
		System.out.println("Result = "+sum(n));
	}

}

/*
 * Output:
 * SET 1:
 * 	enter the value of n : 
	4
	Result = 20

	SET 2:
	enter the value of n : 
	5
	Result = 30

	*/
