/*
 * 8. Write a Program to calculate the length of the string using a recursive function.
 */

package Pdf3;

public class Pdf3_qs8 {
	public static int length(String str) {
		if(str.isEmpty())
			return 0;
		else
			//recursive call with substring excluding the first character
			return 1+length(str.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ankita Pal";
		System.out.println("Length of the string is : "+length(str));
	}

}

/*
 * Output
 * Length of the string is : 10

 * 
 * */
