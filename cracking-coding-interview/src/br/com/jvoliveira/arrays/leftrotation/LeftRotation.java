/**
 * 
 */
package br.com.jvoliveira.arrays.leftrotation;

/**
 * @author João Victor
 *
 */
public class LeftRotation {

	public static void performRotation(int vectorSize, int rotationNumber, int[] numbers) {
		if(vectorSize == 1)
			return;
		for(int rotation = 1; rotation <= rotationNumber; rotation++)
			doRotation(vectorSize, numbers);
	}

	private static void doRotation(int vectorSize, int[] numbers) {
		int first = numbers[0];
		for(int pointer = 0; pointer < vectorSize-1; pointer++)
			numbers[pointer] = numbers[pointer+1];
		numbers[vectorSize-1] = first;
	}
	
}
