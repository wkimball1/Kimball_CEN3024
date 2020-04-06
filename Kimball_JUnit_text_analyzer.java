package Kimball_word_occurrence;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.Test;

//Author Name: William Kimball
//Date: 3/13/2020
//Program Name: Kimball_JUnit_text_analyzer
//Purpose: This tests the text analyzer by using a separate file with known counts


class Kimball_JUnit_text_analyzer{
	
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;


	@Test
	void test() {
		System.setOut(new PrintStream(outContent));
	    
	    Kimball_text_analyzer test1 = new Kimball_text_analyzer("/Users/williamkimball/Desktop/Test1.txt");

	    assertEquals("test 3\nto 1\nthis 1\npurposes 1\nmy 1\nis 1\nfor 1\nfile 1\n", outContent.toString());
	    
	    System.setOut(originalOut);
	    
		


	}


}
