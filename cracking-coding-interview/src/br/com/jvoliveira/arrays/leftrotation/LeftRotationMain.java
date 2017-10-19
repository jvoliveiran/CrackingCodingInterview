package br.com.jvoliveira.arrays.leftrotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotationMain {

	public static void main(String[] args) {
		
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(inputReader);
		
		String lineOne = "";
		String lineTwo = "";
		try{
			lineOne = buffer.readLine();
			lineTwo = buffer.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int vectorSize = Integer.parseInt(lineOne.split(" ")[0]);
		int rotations = Integer.parseInt(lineOne.split(" ")[1]);
		int[] numbers = new int[vectorSize];
		
		for(int index = 0; index < vectorSize; index++)
			numbers[index] = Integer.parseInt(lineTwo.split(" ")[index]);
		
		performRotation(vectorSize, rotations, numbers);
		System.out.println(processOutput(numbers));
	}
	
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
	
	private static String processOutput(int[] numbers){
		String output = "";
		for(int number : numbers)
			output += number + " ";
		return output.trim();
	}
	
}
