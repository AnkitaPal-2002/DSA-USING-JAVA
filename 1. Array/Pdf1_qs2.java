/*
 * 2. Create a Class BasicSort within that implement three Generic methods that can implement the
BuubleSort(), SelectionSort(), InsertionSort() that can sort of any type of data.
 */

package Pdf1;
import java.util.*;
class BasicSort<T extends Comparable<T>>{
	private T[] arr;
	
	public BasicSort(T[] arr) {
		this.arr = arr;
	}
	
	public void show() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void BubbleSort() {
		for(int i =0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1].compareTo(arr[j])>0) {
					T temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is : ");
		this.show();
		
	}
	
	public void SelectionSort() {
		for(int i=0;i<arr.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_index].compareTo(arr[j])>0) {
					min_index = j;
				}
			}
			
			T temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		System.out.println("The sorted array is : ");
		this.show();
		
	}
	
	public void InsertionSort() {
		for(int i=1;i<arr.length;i++) {
			int key = i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j].compareTo(arr[key])>0) {
					T temp = arr[key];
					arr[key] = arr[j];
					arr[j] = temp;
					key = j;
				}
			}
			
		}
		System.out.println("The sorted array is : ");
		this.show();
		
	}
}
public class Pdf1_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {10,30,40,20,50};
		BasicSort<Integer> arr = new BasicSort<Integer>(a);
		System.out.println("The array is : ");
		arr.show();
		System.out.println("After bubble sort:");
		arr.BubbleSort();
		Integer a1[] = {20,10,30,70,35};
		BasicSort<Integer> arr1 = new BasicSort<Integer>(a1);
		System.out.println("The array is : ");
		arr1.show();
		System.out.println("After selection sort:");
		arr1.SelectionSort();
		Integer a2[] = {10,30,40,20,50,100,90,70};
		BasicSort<Integer> arr2 = new BasicSort<Integer>(a2);
		System.out.println("The array is : ");
		arr2.show();
		System.out.println("After insertion sort:");
		arr2.InsertionSort();
		
	}

}

/*
 * OUTPUT:
 * The array is : 
10 30 40 20 50 
After bubble sort:
The sorted array is : 
10 20 30 40 50 
The array is : 
10 30 40 20 50 70 
After selection sort:
The sorted array is : 
10 20 30 40 50 70 
The array is : 
10 30 40 20 50 100 90 70 
After insertion sort:
The sorted array is : 
10 20 30 40 50 70 90 100 

 */
