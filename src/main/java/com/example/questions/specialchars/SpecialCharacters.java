package com.example.questions.specialchars;

public class SpecialCharacters {
	
   public int numberOfSpecialCharacters(String str) {
	   
	   int numOfSpecChars = 0;
	   for (int i = 0; i < str.length(); i++) {
		   char c = str.charAt(i);
		   if (!Character.isLetterOrDigit(c)) {
			   numOfSpecChars++;
		   }
	   }
	   return numOfSpecChars;
   }
}
