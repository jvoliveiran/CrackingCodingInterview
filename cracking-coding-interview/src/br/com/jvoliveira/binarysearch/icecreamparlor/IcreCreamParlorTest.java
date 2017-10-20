package br.com.jvoliveira.binarysearch.icecreamparlor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class IcreCreamParlorTest {

	@Test
	public void baseTest1(){
		int[] flavors = new int[]{1,4,5,3,2};
		int money = 4;
		
		IcreCreamParlor icp = new IcreCreamParlor();
		int[] result = icp.getResult(flavors, money);
		Assert.assertThat(result[0], is(equalTo(1)));
		Assert.assertThat(result[1], is(equalTo(4)));
	}
	
	@Test
	public void baseTest2(){
		int[] flavors = new int[]{2,2,4,3};
		int money = 4;
		
		IcreCreamParlor icp = new IcreCreamParlor();
		int[] result = icp.getResult(flavors, money);
		Assert.assertThat(result[0], is(equalTo(1)));
		Assert.assertThat(result[1], is(equalTo(2)));
	}
	
	@Test
	public void baseTest3(){
		int[] flavors = new int[]{2,1,2};
		int money = 4;
		
		IcreCreamParlor icp = new IcreCreamParlor();
		int[] result = icp.getResult(flavors, money);
		Assert.assertThat(result[0], is(equalTo(1)));
		Assert.assertThat(result[1], is(equalTo(3)));
	}
	
	@Test
	public void baseTest4(){
		int[] flavors = new int[]{5,1,2,1,2};
		int money = 4;
		
		IcreCreamParlor icp = new IcreCreamParlor();
		int[] result = icp.getResult(flavors, money);
		Assert.assertThat(result[0], is(equalTo(3)));
		Assert.assertThat(result[1], is(equalTo(5)));
	}
}
