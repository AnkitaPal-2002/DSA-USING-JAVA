/*
 * 7. Write a Program to reverse an array using a recursive function.
 */


package Pdf3;

public class Pdf3_qs7 {
	public static void reverseprint(int[] arr, int index) {
		if(index == arr.length-1)
			System.out.print(arr[index]+" ");
		else {
			reverseprint(arr, index+1);
			System.out.print(arr[index]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,40,67,50,60};
		System.out.println("Reverse of the array is : ");
		reverseprint(a, 0);
		}

	}
/*OUTPUT
 * Reverse of the array is : 
	60 50 67 40 20 
 * 
 * */
