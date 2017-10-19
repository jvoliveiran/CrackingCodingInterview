/**
 * 
 */
package br.com.jvoliveira.arrays.leftrotation;

import org.junit.Test;

import org.junit.Assert;

/**
 * @author João Victor
 *
 */
public class LeftRotationTest {

	@Test
	public void testEntradaExemplo(){
		int vectorSize = 5;
		int rotationNumber = 4;
		int[] numbers = {1,2,3,4,5};
		LeftRotation.performRotation(vectorSize, rotationNumber,numbers);
		Assert.assertTrue(numbers[0] == 5);
		Assert.assertTrue(numbers[1] == 1);
		Assert.assertTrue(numbers[2] == 2);
		Assert.assertTrue(numbers[3] == 3);
		Assert.assertTrue(numbers[4] == 4);
	}
	
	@Test
	public void testEntradaSimples(){
		int vectorSize = 2;
		int rotationNumber = 10;
		int[] numbers = {1,2};
		LeftRotation.performRotation(vectorSize, rotationNumber,numbers);
		Assert.assertTrue(numbers[0] == 1);
		Assert.assertTrue(numbers[1] == 2);
	}
	
}
