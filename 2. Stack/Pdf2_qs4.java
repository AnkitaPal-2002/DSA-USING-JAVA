/*
 * 4. Write a method in a separate class to evaluate a prefix expression. (Consider more than single
digit number as a input)
 */

package Pdf2;
import java.util.Stack;
class PrefixEvaluator {

	private Stack<Integer> stk;

	PrefixEvaluator() {
		this.stk = new Stack<Integer>();
	}
	
	private boolean isNumaric ( String str ) {
		// for Cancel out the expressions
		String exp  = "-?\\d+(\\.\\d+)?"; 
		return str.matches(exp); 
	}

	public int EvaluatePretfix(String expression) {
		if (expression == null || expression.isEmpty()) {
			throw new IllegalArgumentException("Expression cannot be null or empty");
		}
		
		String tokens[] = expression.split("\\s+");
		
		for( int i=tokens.length-1; i>=0; i-- ) {
			String token = tokens[i];
			
			if(isNumaric(token)) {
				this.stk.push(Integer.parseInt(token));
			}else {
				if (this.stk.isEmpty()) {
                    throw new IllegalArgumentException("Invalid expression: Not enough operands for operator");
                }
                int operand1 = this.stk.pop();
                
                if (this.stk.isEmpty()) {
                    throw new IllegalArgumentException("Invalid expression: Not enough operands for operator");
                }
                int operand2 = this.stk.pop();
                
                int result;
                switch (token) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                this.stk.push(result);
			}
			
		}
		
		if (this.stk.size() != 1) {
            throw new IllegalArgumentException("Invalid expression: Too many operands");
        }
        
        return this.stk.pop();
	}
}

public class Pdf2_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String prefixExpression = "+ 3 * 4 2";
		 
		 PrefixEvaluator ev= new PrefixEvaluator();
		
		 System.out.println( "Result of (" + prefixExpression + ") is: " + ev.EvaluatePretfix(prefixExpression) );

	}

}

/*
 * 
 * Output
 * 
 * Result of (+ 3 * 4 2) is: 11

 */
