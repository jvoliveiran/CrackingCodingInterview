package br.com.jvoliveira.sorting.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		
		int result = compareByScore(o1,o2);
		if(result == 0)
			result = compareByName(o1,o2);
			
		return result;
	}

	private int compareByScore(Player o1, Player o2) {
		if(o1.score > o2.score)
			return -1;
		else if(o2.score > o1.score)
			return 1;
		return 0;
	}

	private int compareByName(Player o1, Player o2) {
		return o1.name.compareTo(o2.name);
	}
}
