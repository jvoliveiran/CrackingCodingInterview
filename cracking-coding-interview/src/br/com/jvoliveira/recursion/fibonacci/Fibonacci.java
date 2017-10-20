package br.com.jvoliveira.recursion.fibonacci;

public class Fibonacci {
	
	public static int execute(int number){
		if(number == 0)
			return 0;
		else if(number == 1)
			return 1;
		else
			return execute(number-1) + execute(number-2);
	}

}
