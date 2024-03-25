/*
 * 2. Write a recursive function to find the maximum and minimum number is the given list
that solves this using divide and conquer.
 */
public class Pdf6_qs2 {
	static <T extends Comparable<T>> T DAC_min(T[] arr, int low, int high){
		T min;
		if(low == high) {
			min = arr[low];
			
		}else if(low == high-1) {
			
				if((arr[low]).compareTo(arr[high])<0) {
					min = arr[low];
				}else {
					min = arr[high];
				}
				
		}else {
			int mid = (low+high)/2;
			T min1 = DAC_min(arr, low, mid);
			T min2 = DAC_min(arr, mid+1, high);
			
			if( min1.compareTo(min2) <0) {
				min = min1;
			}else {
				min = min2;
			}
			
			
		}
		 
		return min;
		
	}
	
	static <T extends Comparable<T>> T DAC_max(T[] arr, int low, int high){
		T max;
		if(low == high) {
			max = arr[low];
			
		}else if(low == high-1) {
			
				if((arr[low]).compareTo(arr[high])>0) {
					max = arr[low];
				}else {
					max = arr[high];
				}
				
		}else {
			int mid = (low+high)/2;
			T max1 = DAC_min(arr, low, mid);
			T max2 = DAC_min(arr, mid+1, high);
			
			if( max1.compareTo(max2) >0) {
				max = max1;
			}else {
				max = max2;
			}
			
			
		}
		 
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {3, 7, 1, 9, 4, 6, 5, 2};
		Integer min = DAC_min(arr, 0, arr.length-1);
		Integer max = DAC_max(arr, 0, arr.length-1);
		
		System.out.println("Minimum element : "+min);
		System.out.println("Maximum element : "+max);
		
		Double[] arr1 = {3.0, 7.0, 1.0, 9.0, 4.0, 6.0, 5.0, 2.0};
		Double min1 = DAC_min(arr1, 0, arr1.length-1);
		Double max1 = DAC_max(arr1, 0, arr1.length-1);
		System.out.println("Minimum element : "+min1);
		System.out.println("Maximum element : "+max1);
		

	}

}

/*
	Output:
	Minimum element : 1
Maximum element : 2
Minimum element : 1.0
Maximum element : 2.0

*/