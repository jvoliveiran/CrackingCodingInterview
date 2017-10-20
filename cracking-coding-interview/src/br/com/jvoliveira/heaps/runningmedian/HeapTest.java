package br.com.jvoliveira.heaps.runningmedian;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;


public class HeapTest {

	private Heap heap;
	
	@Test
	public void baseTest(){
		heap = new Heap();
		heap.add(12);
		float result = heap.getMedian();
		Assert.assertThat(result, is(equalTo(12.0f)));
	}
	
	@Test
	public void baseTest2Steps(){
		heap = new Heap();
		heap.add(12);
		heap.add(4);
		float result = heap.getMedian();
		Assert.assertThat(result, is(equalTo(8.0f)));
	}
	
	@Test
	public void baseTest3Steps(){
		heap = new Heap();
		heap.add(12);
		heap.add(4);
		heap.add(5);
		float result = heap.getMedian();
		Assert.assertThat(result, is(equalTo(5.0f)));
	}
	
	@Test
	public void baseTest4Steps(){
		heap = new Heap();
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(4);
		float result = heap.getMedian();
		Assert.assertThat(result, is(equalTo(2.5f)));
	}
	
}
