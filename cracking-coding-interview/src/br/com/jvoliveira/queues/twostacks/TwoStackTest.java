package br.com.jvoliveira.queues.twostacks;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoStackTest {
	
	public TwoStack<Integer> twoStack;
	
	@Before
	public void setUp(){
		twoStack = new TwoStack<>();
	}

	@Test
	public void baseTestCase(){
		twoStack.enqueue(42);
		twoStack.dequeue();
		twoStack.enqueue(14);
		int first = 14;
		Assert.assertThat(twoStack.peek(), is(equalTo(first)));
		twoStack.enqueue(28);
		Assert.assertThat(twoStack.peek(), is(equalTo(first)));
		twoStack.enqueue(60);
		twoStack.enqueue(78);
		twoStack.dequeue();
		first = 28;
		twoStack.dequeue();
		first = 60;
		Assert.assertThat(twoStack.peek(), is(equalTo(first)));
	}
	
	@Test
	public void testCaseOne(){
		twoStack.enqueue(76);
		twoStack.enqueue(33);
		twoStack.dequeue();
		twoStack.enqueue(23);
		twoStack.enqueue(97);
		twoStack.enqueue(21);
		int first = 33;
		Assert.assertThat(twoStack.peek(), is(equalTo(first)));
		Assert.assertThat(twoStack.peek(), is(equalTo(first)));
		twoStack.enqueue(74);
		Assert.assertThat(twoStack.peek(), is(equalTo(first)));
	}
	
}
