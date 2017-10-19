package br.com.jvoliveira.stack.balancedbrackets;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {

	@Test
	public void firstBaseTest(){
		String expression = "{[()]}";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertTrue(result);
	}
	
	@Test
	public void secondBaseTest(){
		String expression = "{[(])}";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertFalse(result);
	}
	
	@Test
	public void thirdBaseTest(){
		String expression = "{{[[(())]]}}";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCase0(){
		String expression = "{)[](}]}]}))}(())(";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testCase1(){
		String expression = "({}([][]))[]()";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCase2(){
		String expression = "()";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCase3(){
		String expression = "[](){()}";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCase4(){
		String expression = "}][}}(}][))]";
		boolean result = BalancedBrackets.isBalanced(expression);
		Assert.assertFalse(result);
	}
	
}
