package br.com.jvoliveira.tries.contacts;

import java.util.HashMap;
import java.util.Map;

public class Contact {

	Map<String,Integer> dictionary = new HashMap<>();
	
	//FOR MAIN USE
	public void execute(String op, String contact){
		if(op.equals("add"))
			add(contact);
		else
			find(contact);
	}
	
	public void add(String name){
		for(int index = 1; index <= name.length(); index++){
			String piece = name.substring(0, index);
			if(dictionary.containsKey(piece))
				dictionary.put(piece, dictionary.get(piece)+1);
			else
				dictionary.put(piece, 1);
		}
	}
	
	public int find(String parcialName){
		int output = 0;
		if(dictionary.containsKey(parcialName))
			output = dictionary.get(parcialName);
		System.out.println(output);
		return output;
	}
}
