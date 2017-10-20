package br.com.jvoliveira.mergesort.coutinginversions;

import java.util.Arrays;

public class MergeSort {

	long inversionCounter;
	
	public MergeSort() {
		inversionCounter = 0;
	}
	
	public int [] mergeSort(int array[]){
		if(array.length <= 1)
			return array;
		
		int middleOfArray = array.length / 2;
		int[] leftArray = new int[middleOfArray];
		int[] rightArray = new int [array.length - middleOfArray];
		
		for(int i = 0; i < middleOfArray; i++)
			leftArray[i] = array[i];
		for(int i = middleOfArray; i < array.length; i++)
			rightArray[i-middleOfArray] = array[i];
		
		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);
		int[] result = mergeArrays(leftArray,rightArray);
		return result;
	}
	
	private int[] mergeArrays(int[] leftArray, int[] rightArray) {
		int resultSize = leftArray.length + rightArray.length;
		int[] result = new int[resultSize];
		
		int leftPointer = 0, rightPointer = 0, index = 0;
		while(leftPointer < leftArray.length || rightPointer < rightArray.length){
			
			if(leftPointer == leftArray.length){
				result[index] = rightArray[rightPointer];
				rightPointer++;
			}else if(rightPointer == rightArray.length){
				result[index] = leftArray[leftPointer];
				leftPointer++;
			}else if(rightArray[rightPointer] < leftArray[leftPointer]){
				incrementCounter(leftArray.length - leftPointer);
				result[index] = rightArray[rightPointer];
				rightPointer++;
			}else{
				result[index] = leftArray[leftPointer];
				leftPointer++;
			}
			index++;
		}
		
		return result;
	}

	public void incrementCounter(int inversions){
		inversionCounter += inversions;
	}
	
}
