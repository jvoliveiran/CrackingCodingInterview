package br.com.jvoliveira.tries.contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactTest {
	
	Contact contact;
	
	@Before
	public void setUp(){
		contact = new Contact();
	}
	
	@Test
	public void baseAddTest(){
		contact.add("hack");
		Assert.assertThat(contact.dictionary.keySet().size(), is(equalTo(4)));
	}
	
	@Test
	public void baseAddOcurrencyTest(){
		contact.add("hack");
		Assert.assertThat(contact.dictionary.get("hack"), is(equalTo(1)));
	}

}
