/*
 * 3. Write a Generic method that computes the Second minimum and Second maximum elements
of an array of type T and returns a pair containing the minimum and maximum value.
 * 
 */


package Pdf1;
import java.util.*;

//Pair class definition
class Pair<X, Y> {
    private X first;
    private Y second;
    
    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }
    
    public X getFirst() {
        return first;
    }
    
    public Y getSecond() {
        return second;
    }
}
class SecondMinMax<T extends Comparable<T>>{
	private T[] arr;
	public SecondMinMax(T[] arr) {
		this.arr = arr;
	}
	
	public Pair<T,T> find(){
		Arrays.sort(arr);
		T secondmax = arr[arr.length-2];
		T secondmin = arr[1];
		return new Pair<>(secondmax, secondmin);
	}
}

public class Pdf1_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intarr = {10,30,20,50,40,60};
		SecondMinMax<Integer> arr = new SecondMinMax<Integer>(intarr);
		
		Pair<Integer, Integer> result = arr.find();
		System.out.println("The second maximum is : "+result.getFirst());
		System.out.println("The second minimum is : "+result.getSecond());
	}

}
