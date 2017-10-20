package br.com.jvoliveira.lonelyinteger;

public class LonelyInteger {

	public int fillArray(int[] array){
		int[] counterArray = new int[101];
		
		for(int i = 0; i < array.length; i++)
			counterArray[array[i]]++;
		
		for(int i = 0; i<counterArray.length; i++){
			if(counterArray[i] % 2 != 0)
				return i;
		}
		
		return 0;
	}
	
}
