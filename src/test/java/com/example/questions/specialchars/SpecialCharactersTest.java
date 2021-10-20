package com.example.questions.specialchars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpecialCharactersTest {
	
	@Test
	public void testString1() {
		
		// given
		String strToTest = "!#$IBM.Cloud.service.Portal!!";
		
		// when
		SpecialCharacters sc = new SpecialCharacters();
		int actualResult = sc.numberOfSpecialCharacters(strToTest);
		
		// then
		assertEquals(8, actualResult);
	}
	
	@Test
	public void testString2() {
		
		// given
		String strToTest = "!*)(&Develop&Y(*Deploy%*&Cloud.cont@iner$";
		
		// when
		SpecialCharacters sc = new SpecialCharacters();
		int actualResult = sc.numberOfSpecialCharacters(strToTest);
		
		// then
		assertEquals(14, actualResult);
	}
	
	@Test
	public void testString3() {
		
		// given
		String strToTest = "abcdefghijklmnopqrstuvwxyz 0123456789";
		
		// when
		SpecialCharacters sc = new SpecialCharacters();
		int actualResult = sc.numberOfSpecialCharacters(strToTest);
		
		// then
		assertEquals(0, actualResult);
	}
	
	@Test
	public void testString4() {
		
		// given
		String strToTest = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		// when
		SpecialCharacters sc = new SpecialCharacters();
		int actualResult = sc.numberOfSpecialCharacters(strToTest);
		
		// then
		assertEquals(0, actualResult);
	}

}
