/*
 * 4. Write a recursive function to calculate the sum of all digits of a number entered by the user.
 */


package Pdf3;

public class Pdf3_qs4 {
	public static int sum_of_digits(int num) {
		if(num/10 == 0)
			return num;
		else {
			int rem = num%10;
			return rem+sum_of_digits(num/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 234;
		System.out.println("Sum of digits : "+sum_of_digits(num));
	}

}

/*Output
Sum of digits : 9


*/