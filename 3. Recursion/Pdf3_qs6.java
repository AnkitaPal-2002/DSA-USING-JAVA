/*
 * 6. Write a Program to implement Binary Search using a recursive function.
 */

package Pdf3;

public class Pdf3_qs6 {
	public static int binarysearch(int[] arr, int low, int high, int key) {
		if(low<=high) {
			int mid = low+(high-low)/2;
			
			if(key == arr[mid]) {
				return mid; //return the index of the key element
			}else if(arr[mid]<key) {
				return binarysearch(arr, mid+1, high, key);
			}else {
				return binarysearch(arr, low, mid-1, key);
			}
		}
		
		return -1; //key is not found
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50,60,70};
		int result = binarysearch(a,0,6,20);
		if(result!=-1)
			System.out.println("20 is found at the index "+result);
		else
			System.out.println("20 is not found");
		
		int result1 = binarysearch(a,0,6,200);
		if(result1!=-1)
			System.out.println("200 is found at the index "+result1);
		else
			System.out.println("200 is not found");
	}

}


/* Output:
 * 
 * 	20 is found at the index 1
	200 is not found

 * 
 */
