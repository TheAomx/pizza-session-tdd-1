package de.ov.software.kata.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import static de.ov.software.kata.tdd.StringCalculator.add;

public class StringCalculatorTest {
	@Test
	public void givenAnEmptyString_ShouldReturnZero () throws Exception {
		int result = add("");
		
		assertEquals(0, result);
	}
	
	@Test
	public void givenOneNumber_ShouldReturnThatNumber () throws Exception {
		int result = add("1");
		
		assertEquals(1, result);
	}
	
	@Test
	public void givenTwoNumbers_ShouldReturnSumOfBothNumbers() throws Exception {
		int result = add("1,2");
		
		assertEquals(3, result);
	}
	
	@Test
	public void givenThreeNumbers_ShouldReturnSumOfAllNumbers() throws Exception {
		int result = add("1,2,3");
		
		assertEquals(6, result);
	}
	
	@Test
	public void givenTwoNumbersWithNewLines_ShouldReturnSumOfAllNumbers() throws Exception {
		int result = add("1\n2");
		
		assertEquals(3, result);
	}
	
	@Test
	public void givenTwoNumbersWithNewLinesAndOneCommaSeperatedValue_ShouldReturnSumOfAllNumbers() throws Exception {
		int result = add("1\n2,3");
		
		assertEquals(6, result);
	}
	
	@Test(expected=NumberFormatException.class)
	public void givenAnNegativeNumber_ShouldThrowException() throws Exception {
		add("-1");
	}
	
	@Test
	public void givenTwoNegativeNumbers_ShouldThrowExceptionWithBothNumbersInErrorMessage() throws Exception {
		try {
			add("-1,-2");
		} catch (NumberFormatException e) {
			assertTrue(e.getMessage().contains("-1"));
			assertTrue(e.getMessage().contains("-2"));
		}
	}
	
	@Test
	public void givenOneNegativeNumbersAndOnePositiveNumber_ShouldThrowExceptionWithOneNumberInErrorMessage() throws Exception {
		try {
			add("-1,2");
		} catch (NumberFormatException e) {
			assertTrue(e.getMessage().contains("-1"));
			assertFalse(e.getMessage().contains("-2"));
		}
	}
	
	@Test
	public void givenNumberBiggerThan1000_ShouldIgnoreThatNumber() throws Exception {
		int result = add("2,1001");
		
		assertEquals(2, result);
	}
		
	@Test
	public void givenTwoNumbersBiggerThan1000_ShouldIgnoreBothNumbersHigherThan1000() throws Exception {
		int result = add("2,1001,1002,3");
		
		assertEquals(5, result);
	}
		
	
	
	@Test
	public void givenThousandNumbers_ShouldReturnSumOfAllNumbers() throws Exception {
		String input = "";
		int result = 0;
		
		for (int i = 1; i <= 1000; i++) {
			input += i;
			if (i != 1000) {
				input += ",";
			}
			result += i;
		}
		
		assertEquals(result, add(input));
	}
}
