package br.com.jvoliveira.recursion.fibonacci;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void baseCase1Test(){
		int result = Fibonacci.execute(2);
		Assert.assertThat(result, is(equalTo(1)));
	}
	
	@Test
	public void baseCase2Test(){
		int result = Fibonacci.execute(3);
		Assert.assertThat(result, is(equalTo(2)));
	}
	
	@Test
	public void baseCase3Test(){
		int result = Fibonacci.execute(4);
		Assert.assertThat(result, is(equalTo(3)));
	}
	
	@Test
	public void baseCase4Test(){
		int result = Fibonacci.execute(5);
		Assert.assertThat(result, is(equalTo(5)));
	}
	
	@Test
	public void baseCase5Test(){
		int result = Fibonacci.execute(6);
		Assert.assertThat(result, is(equalTo(8)));
	}
	
}
