/*
 * 2. Write a method in a separate class to check an expression is valid or not.
 * 
 */


package Pdf2;
import java.util.*;

class Stack1<T>{
	private int maxsize;
	private T[] stackarr;
	private int top;
	Stack1(){
		
		this.top = -1;
		this.maxsize=100;
		this.stackarr = (T[])new Object[maxsize];
	}
	
	public boolean isFull() {
		return (top==maxsize-1);
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void push(T i){
		if(isFull()) {
			System.out.println("Stack is overflow....");
			
		}else {
			
			this.stackarr[++this.top] = i;
			//System.out.println(ele+"is inserted successfully....");
		}
	}
	
	public T pop(){
		if(isEmpty()) {
			System.out.println("Stack is underflow....");
		}
			T ele = this.stackarr[top--];
			return ele;
		
		
	}
	
	public boolean IsMatch(Stack1<T> s1, Stack1<T> s2) {
		if(s1.top != s2.top) {
			return false;
		}else {
			for(int i=0;i<=s1.top;i++) {
				if(!s1.stackarr[i].equals(s2.stackarr[i])) {
					return false;
				}
			}
			
			return true;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty....");
		}else {
			for(int i=0;i<=this.top;i++) {
				System.out.print(this.stackarr[i]+" ");
			}
			System.out.println();
		}
		
	}
	
}

class ExpressionValidator{
	public static boolean IsValidExpressionValidator(String expression){
		Stack1<Character> st = new Stack1<>();
		for(char c: expression.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			}else if(c==')'||c=='}'||c==']') {
				if(st.isEmpty()) {
					return false; //Closing bracket with corresponding no opening bracket
				}
				
				char openingBracket = st.pop();
				
				if((c==')' && openingBracket!='(') || (c=='}' && openingBracket!='{') || (c==']' && openingBracket!='[')) {
					return false; //Mismatched opening and closing brackets
				}
				
			}
		}
		
		return st.isEmpty();
	}
}
public class Pdf2_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String expression = "{([])}";
			System.out.println(expression+" is valid ? "+ExpressionValidator.IsValidExpressionValidator(expression));
			String expression1 = "{([])})";
			System.out.println(expression+" is valid ? "+ExpressionValidator.IsValidExpressionValidator(expression1));
	}

}


/*
 * Output
 * 	
 	{([])} is valid ? true
	{([])} is valid ? false


 * 
 * 
 */
