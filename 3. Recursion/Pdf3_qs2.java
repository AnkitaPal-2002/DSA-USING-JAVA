/*
 * 2. Write a recursive function to print the first n Fibonacci numbers.
 */

package Pdf3;

public class Pdf3_qs2 {
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("First "+n+" fibonacci nos are : ");
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i)+" ");
		}
		System.out.println();

	}

}

/*Output
 * 
 * 	First 10 fibonacci nos are : 
	0 1 1 2 3 5 8 13 21 34 

 * 
 * */


