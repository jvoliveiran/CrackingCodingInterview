package br.com.jvoliveira.strings.anagram;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void baseTest(){
		String first = "cde";
		String second = "abc";
		
		Integer numberNeeded = Anagram.numberNeeded(first, second);
		Assert.assertThat(numberNeeded, is(equalTo(4)));
	}
	
	@Test
	public void case1Test(){
		String first = "cdef";
		String second = "abc";
		
		Integer numberNeeded = Anagram.numberNeeded(first, second);
		Assert.assertThat(numberNeeded, is(equalTo(5)));
	}
	
	@Test
	public void case2Test(){
		String first = "cdeff";
		String second = "abc";
		
		Integer numberNeeded = Anagram.numberNeeded(first, second);
		Assert.assertThat(numberNeeded, is(equalTo(6)));
	}
	
}
