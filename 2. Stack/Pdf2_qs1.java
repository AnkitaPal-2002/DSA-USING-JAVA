/*
 * 1. Write a program to implement a Stack22 class (use a Array to store the elements of the Stack22).
[Implement Stack22 Overflow and Underflow by user defined Exception]. Write a method to
check two Stack22 are carrying similar elements or not.(Repetition of the elements are not
consider)
 */

package Pdf2;
import java.util.*;
class Stack22OverflowException extends Exception{
	Stack22OverflowException(String msg){
		super(msg);
	}
}

class Stack22UnderflowException extends Exception{
	Stack22UnderflowException(String msg){
		super(msg);
	}
}
class Stack22<T>{
	private int maxsize;
	private T[] Stack22arr;
	private int top;
	Stack22(T[] Stack22arr, int maxsize){
		this.Stack22arr = Stack22arr;
		this.top = -1;
		this.maxsize=maxsize;
	}
	
	public boolean isFull() {
		return (top==maxsize-1);
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void push(T ele) throws Stack22OverflowException {
		if(isFull()) {
			try {
				throw new Stack22OverflowException("Stack22 is overflow....");
			}catch(Stack22OverflowException e) {
				System.out.println(e.getMessage());
			}
			
		}else {
			
			this.Stack22arr[++top] = ele;
			System.out.println(ele+"is inserted successfully....");
		}
	}
	
	public void pop() throws Stack22UnderflowException{
		if(isEmpty()) {
			try {
				throw new Stack22UnderflowException("Stack22 is underflow....");
			}catch(Stack22UnderflowException e) {
				System.out.println(e.getMessage());
			}
			
		}else {
			T ele = this.Stack22arr[top--];
			System.out.println(ele+"is popped successfully....");
		}
	}
	
	public boolean IsMatch(Stack22<T> s1, Stack22<T> s2) {
		if(s1.top != s2.top) {
			return false;
		}else {
			for(int i=0;i<=s1.top;i++) {
				if(!s1.Stack22arr[i].equals(s2.Stack22arr[i])) {
					return false;
				}
			}
			
			return true;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack22 is empty....");
		}else {
			for(int i=0;i<=this.top;i++) {
				System.out.print(this.Stack22arr[i]+" ");
			}
			System.out.println();
		}
		
	}
	
}
public class Pdf2_qs1 {

	public static void main(String[] args) throws Stack22OverflowException, Stack22UnderflowException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maxsize of the Stack22 : ");
		int max = sc.nextInt();
		
		Integer[] a= new Integer[max];
		Integer[] b= new Integer[max];
		
		Stack22<Integer> s1 = new Stack22<>(a,max);
		Stack22<Integer> s2 = new Stack22<>(b,max);
		
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.display();
		s1.pop();
		s1.display();
		
		s2.display();
		s2.push(5);
		s2.push(6);
		s2.push(7);
		s2.display();
		
		s2.pop();
		
		System.out.println("Is matching ? "+s2.IsMatch(s1, s2));

	}

	

	

}

/*
 * 
 * Output
 * 
	Enter the maxsize of the Stack22 : 
	5
	5is inserted successfully....
	6is inserted successfully....
	7is inserted successfully....
	5 6 7 
	7is popped successfully....
	5 6 
	Stack22 is empty....
	5is inserted successfully....
	6is inserted successfully....
	7is inserted successfully....
	5 6 7 
	7is popped successfully....
	Is matching ? true

 */
