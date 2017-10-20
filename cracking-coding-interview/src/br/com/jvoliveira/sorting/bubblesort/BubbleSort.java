package br.com.jvoliveira.sorting.bubblesort;

public class BubbleSort {

	int[] vector;
	int size;
	int numberOfSwaps;
	
	public BubbleSort(int size){
		this.size = size;
		numberOfSwaps = 0;
		vector = new int[size];
	}
	
	public void sort(){
		for (int i = 0; i < size; i++) {
		    // Track number of elements swapped during a single array traversal
		    
		    
		    for (int j = 0; j < size - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (vector[j] > vector[j + 1]) {
		            swap(j, j+1);
		            numberOfSwaps++;
		        }
		    }
		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
		printResult(numberOfSwaps, vector);
	}

	private void printResult(int numberOfSwaps, int[] vector) {
		System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
		System.out.println("First Element: "+vector[0]);
		System.out.println("Last Element: "+vector[vector.length-1]);
	}

	private void swap(int i, int j) {
		int tempValue = vector[i];
		vector[i] = vector[j];
		vector[j] = tempValue;
	}
	
}
