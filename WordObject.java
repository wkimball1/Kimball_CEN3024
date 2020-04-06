package Kimball_word_occurrence;


//Author Name: William Kimball
//Date: 3/8/2020
//Program Name: Kimball_module7_word_occurrence
//Purpose: This reads in a text file and counts the word occurrence and lists the top 20 words
public class WordObject {
	
	private String word;
	private Integer count;

	

	public WordObject(String s, Integer i) {
	
		setCount(i);
		setWord(s);
	}

	public void setCount(Integer i) {
		count = i;
	}
	
	public void setWord(String s) {
		word = s;
		
	}
	
	public Integer getCount() {
		return count;
	}
	
	public String getWord() {
		return word;
		
	}
	

}
