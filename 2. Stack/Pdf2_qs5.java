package Pdf2;

import java.util.Stack;

class InfixToPostfixConverter {

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char c : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfixExpression.append(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            } else {
                while (!operatorStack.isEmpty() && precedence(c) <= precedence(operatorStack.peek())) {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            if (operatorStack.peek() == '(') {
                return "Invalid infix expression"; // Parentheses mismatch
            }
            postfixExpression.append(operatorStack.pop());
        }

        return postfixExpression.toString();
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
            default:
                return -1;
        }
    }

    
}

public class Pdf2_qs5 {
	public static void main(String[] args) {
        String infixExpression = "a+b*c-(d/e+f)*g";
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + InfixToPostfixConverter.infixToPostfix(infixExpression));
    }
}


/*Output
 * Infix Expression: a+b*c-(d/e+f)*g
	Postfix Expression: abc*+de/f+g*-

 */
