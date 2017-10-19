package br.com.jvoliveira.stack.balancedbrackets;

import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		if(expression.length() % 2 != 0 || !isLeftBracket(expression.charAt(0)))
			return false;
		
		Stack<Character> brackets = new Stack<>();
		brackets.push(expression.charAt(0));
		int pointer = 1;
		
		while(pointer < expression.length()){
			char piece = expression.charAt(pointer);
			if(isLeftBracket(piece))
				brackets.push(piece);
			else if(brackets.isEmpty() || !isValidPair(brackets.peek(), piece))
				return false;
			else
				brackets.pop();
			pointer++;
		}
		
		return brackets.isEmpty();
	}
	
	public static boolean isValidPair(char topStack, char piece) {
		String bracketPair = topStack + "" + piece;
		return bracketPair.equals("{}") || bracketPair.equals("[]") 
				|| bracketPair.equals("()");
	}

	public static boolean isLeftBracket(char piece) {
		return piece == '{' || piece == '(' || piece == '[';
	}

}
