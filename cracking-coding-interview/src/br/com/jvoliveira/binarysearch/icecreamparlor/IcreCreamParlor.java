package br.com.jvoliveira.binarysearch.icecreamparlor;

import java.util.Arrays;

public class IcreCreamParlor {
	
	public int[] getResult(int[] flavors, int money){
		int[] clonedFlavors = flavors.clone();
		Arrays.sort(clonedFlavors);
		
		int[] values = new int[2];
		for(int indexFlavor = 0; indexFlavor < clonedFlavors.length; indexFlavor++){
			int complemention = money - clonedFlavors[indexFlavor];
			int indexComplemention = Arrays.binarySearch(clonedFlavors, indexFlavor+1, clonedFlavors.length, complemention);
			if(indexComplemention >= 0 && indexComplemention < clonedFlavors.length){
				values[0] = clonedFlavors[indexFlavor];
				values[1] = complemention;
				return getIndexOfValues(values,flavors);
			}
		}
		
		return null;
	}

	private int[] getIndexOfValues(int[] values, int[] flavors) {
		int[] result = new int[2];
		int founded = 0;
		for(int i = 0; i < flavors.length; i++){
			if(flavors[i] == values[0] || flavors[i] == values[1]){
				result[founded] = i+1;
				founded++;
			}
			if(founded == 2)
				return result;
		}
		return null;
	}

}
