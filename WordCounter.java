package Kimball_word_occurrence;

/**
* Public Class WordCounter
* Object with a word and the count of it 
* @author William Kimball
* Date: 4/4/2020
*/

public class WordCounter {
	private int m_count;
	private String m_word;
	
	/**
	 * Counts the words
	 * @param count
	 * @param word
	 */
	
	public WordCounter(int count, String word) {
		m_count = count;
		m_word = word;
	}
	
	/**
	 *  gets the count of a word
	 * @return int Count
	 */
	
	public int getCount() {
		return m_count;
		
	}
	
	/**
	 *  gets the word being counted
	 * @return String word
	 */
	
	public String getWord() {
		return m_word;
		
	}
	
	/**
	 *  adds 1 to the count
	 */
	
	public void incrementCount() {
		m_count += 1;
		
	}
	

	/**
	 * sets the count of the word  
	 * @param count
	 */
	
	public void setCount(int count) {
		m_count = count;
		
	}
	
	/**
	 * Sets the word of the object
	 * @param word
	 */
	public void setWord(String word) {
		m_word = word;
	}
	

	@Override
	public String toString() {
		return m_count + "\t" + m_word;
	}
}
