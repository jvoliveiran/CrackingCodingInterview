package br.com.jvoliveira.mergesort.coutinginversions;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

	MergeSort mergeSort;
	
	@Before
	public void setUp(){
		mergeSort = new MergeSort();
	}
	
	@Test
	public void baseTest1(){
		int[] array1 = new int[]{1,1,1,2,2};
		int[] array2 = new int[]{2,1,3,1,2};
		
		mergeSort.mergeSort(array1);
		Assert.assertTrue(mergeSort.inversionCounter == 0);
		mergeSort.mergeSort(array2);
		Assert.assertThat(mergeSort.inversionCounter, is(equalTo(4)));
	}

}
