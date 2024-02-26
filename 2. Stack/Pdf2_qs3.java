/*
 * 3. Write a method in a separate class to evaluate a postfix expression (Consider more than single
digit number as a input).
 */

package Pdf2;
import java.util.*;
class Postfix{
	static  <T> T evaluatePostfix(String exp){
		Stack1<Integer> st = new Stack1<>();
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if(Character.isDigit(c)) {
				st.push(c-'0');
				//System.out.println("Push:"+c);
			}
				
			else {
				Integer val1=st.pop();
				Integer val2=st.pop();
				switch(c) {
					case '+':
						@SuppressWarnings("unchecked") 
						T res = (T)Double.valueOf(Double.valueOf(val2)+Double.valueOf(val1));
						int ch = ((Double) res).intValue();
						//System.out.println(ch);
						st.push((Integer) ch);
						break;
						
					case '-':
						@SuppressWarnings("unchecked") 
						T res1 = (T)Double.valueOf(Double.valueOf(val2)-Double.valueOf(val1));
						int ch1 = ((Double) res1).intValue();
						st.push((Integer) ch1);
						//System.out.println(ch1);
						break;
					
					case '*':
						@SuppressWarnings("unchecked") 
						Double res3 = Double.valueOf(Double.valueOf(val2)*Double.valueOf(val1));
						int ch11 =  res3.intValue();
						st.push((Integer) ch11);
						//System.out.println(ch11);
						break;
						
					case '/':
						@SuppressWarnings("unchecked") 
						Double res4 = Double.valueOf(Double.valueOf(val2)/Double.valueOf(val1));
						int ch2 = ((Double)res4).intValue();
						st.push((Integer) ch2);
						//System.out.println(res4);
						break;
						
				}
					
						
			}
		}
		
		return (T)st.pop();
	}
}
public class Pdf2_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "231*+9-";
		System.out.println("Expression is : "+s1);
		System.out.println("Result is : "+(Object)Postfix.evaluatePostfix(s1));
		
		String s2 = "53+62/*35*+";
		System.out.println("Expression is : "+s2);
		System.out.println("Result is : "+(Object)Postfix.evaluatePostfix(s2));


	}

}

/*Output
 * 
 * 	Expression is : 231*+9-
	Result is : -4
	Expression is : 53+62/*35*+
	Result is : 39

 * 
 */
