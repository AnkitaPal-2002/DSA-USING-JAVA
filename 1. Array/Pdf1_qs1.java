/*
 * 1. Create a Class Search within that implement two Generic method LinearSearch(),
BinarySearch(). Test your program for different data.
 */

package Pdf1;
import java.util.*;
class Search<T extends Comparable<T>>{
	
	private T[] list;
	
	public Search(T[] list) {
		this.list = list;
	}
	
	public void showlist() {
		System.out.println("The array is : ");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	
	public void linear_search(T key) {
		int flag = 0;
		
		for(int i=0;i<list.length;i++) {
			if(list[i] == key) {
				System.out.println(key+" is at index "+i);
				flag =1;
			}
		}
		
		if(flag == 0) {
			System.out.println(key+" is not found");
		}
		
		
	}
	
	public void binary_search(T key) {
		int low = 0;
		int high = this.list.length-1;
		int mid = low + (high-low)/2;
		
		int flag = 0;
		while(low<=high) {
			if(key == list[mid]) {
				System.out.println(key+" is found at index "+mid);
				flag = 1;
			}else if(key.compareTo(list[mid])<0) {
				high = mid -1;
				
			}else {
				low = mid +1;
			}
		}
		
		if(flag == 0) {
			System.out.println(key+" is not found");
		}
	}
	
	
}
public class Pdf1_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer a[] = {10,30,40,20,50};
		Search<Integer> list = new Search<Integer>(a);
		list.showlist();
		System.out.println("Enter the key : ");
		int key = sc.nextInt();
		list.linear_search(key);
		System.out.println("Enter the key : ");
		int k = sc.nextInt();
		list.linear_search(k);
	}

}


/*
 * Output:
 * SET 1:
 * 		The array is : 
		10 30 40 20 50 
		Enter the key : 
		40
		40 is at index 2
		Enter the key : 
		30
		30 is at index 1

 * 
 * 
 * 
 * 
 */
