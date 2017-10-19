package br.com.jvoliveira.ransomnote;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RansomNote {
	
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note) {
    	magazineMap = fillMap(magazineMap, magazine);
    	noteMap = fillMap(noteMap, note);
    }
    
    private Map<String,Integer> fillMap(Map<String,Integer> map, String text){
    	if(map == null)
    		map = new HashMap<>();
    	String[] words = text.split(" ");
    	for(String word : words){
    		if(map.containsKey(word))
    			map.put(word, map.get(word)+1);
    		else
    			map.put(word, 1);
    	}
    	return map;
    }
    
    public boolean solve(int noteWords, int magazineWords) {
    	if(noteWords > magazineWords)
    		return false;
    	
    	boolean answer = true;
    	
    	Iterator<String> iteratorKey = noteMap.keySet().iterator();
    	while(iteratorKey.hasNext()){
    		String noteKeyWord = iteratorKey.next();
    		int noteWordCount =  noteMap.get(noteKeyWord);
    		
    		if(magazineMap.get(noteKeyWord) == null){
    			answer = false;
    			break;
    		}else if(magazineMap.get(noteKeyWord) < noteWordCount){
    			answer = false;
    			break;
    		}else{
    			magazineMap.put(noteKeyWord, magazineMap.get(noteKeyWord)-noteWordCount);
    			noteWords = noteWords - noteWordCount;
    		}
    	}
    	
    	return answer && (noteWords == 0);
    }

}
