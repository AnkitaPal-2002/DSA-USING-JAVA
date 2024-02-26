/*6. Write a method in a separate class to convert an infix expression to its corresponding prefix
expression.
 */

package Pdf2;
import java.util.Stack;
public class Pdf2_qs6 {

	 public static String infixToPrefix(String infix) {
	        // Step 1: Reverse the infix expression
	        String reversedInfix = new StringBuilder(infix).reverse().toString();

	        // Step 2: Convert the reversed infix expression to postfix
	        String postfix = infixToPostfix(reversedInfix);

	        // Step 3: Reverse the postfix expression to get the prefix expression
	        String prefix = new StringBuilder(postfix).reverse().toString();

	        return prefix;
	    }

	    private static String infixToPostfix(String infix) {
	        StringBuilder postfix = new StringBuilder();
	        Stack<Character> stack = new Stack<>();

	        for (char c : infix.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                postfix.append(c);
	            } else if (c == ')') {
	                stack.push(c);
	            } else if (c == '(') {
	                while (!stack.isEmpty() && stack.peek() != ')') {
	                    postfix.append(stack.pop());
	                }
	                if (!stack.isEmpty() && stack.peek() == ')') {
	                    stack.pop();
	                }
	            } else {
	                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
	                    postfix.append(stack.pop());
	                }
	                stack.push(c);
	            }
	        }

	        while (!stack.isEmpty()) {
	            postfix.append(stack.pop());
	        }

	        return postfix.toString();
	    }

	    private static int precedence(char operator) {
	        switch (operator) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        String infix = "a+b*(c^d-e)^(f+g*h)-i";
	        String prefix = infixToPrefix(infix);
	        System.out.println("Infix: " + infix);
	        System.out.println("Prefix: " + prefix);
	    }
}

/*output
Infix: a+b*(c^d-e)^(f+g*h)-i
Prefix: +a-*b^-^cde+f*ghi


*/