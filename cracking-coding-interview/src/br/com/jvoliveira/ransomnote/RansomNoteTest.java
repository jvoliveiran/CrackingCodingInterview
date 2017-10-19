package br.com.jvoliveira.ransomnote;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {
	
	private RansomNote ransomNote;
	
	@Test
	public void baseTest(){
		String magazine = "give me one grand today night";
		String note = "give one grand today";
		int magazineWords = 6;
		int noteWords = 4;
		
		ransomNote = new RansomNote(magazine, note);
		boolean result = ransomNote.solve(noteWords, magazineWords);
		Assert.assertTrue(result);
	}
	
	@Test
	public void secondBaseTest(){
		String magazine = "two times three is not four";
		String note = "two times two is four";
		int magazineWords = 6;
		int noteWords = 5;
		
		ransomNote = new RansomNote(magazine, note);
		boolean result = ransomNote.solve(noteWords, magazineWords);
		Assert.assertTrue(!result);
	}
	
	@Test
	public void thirdBaseTest(){
		String magazine = "give me ONE grand today night";
		String note = "give one grand today";
		int magazineWords = 6;
		int noteWords = 4;
		
		ransomNote = new RansomNote(magazine, note);
		boolean result = ransomNote.solve(noteWords, magazineWords);
		Assert.assertTrue(!result);
	}

}
