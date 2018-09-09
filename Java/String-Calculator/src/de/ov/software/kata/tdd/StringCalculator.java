package de.ov.software.kata.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
	public static int add(String numberString) {
		if (numberString.isEmpty()) {
			return 0;
		}
		
		List <Integer> numbers = splitNumberString(numberString, ",");
		checkForNegativeNumbers(numbers);
		List<Integer> filtered = numbers.stream().filter((Integer n) -> n <= 1000).collect(Collectors.toList());
		return sumNumbers(filtered);
	}
	
	private static List<Integer> splitNumberString (String numberString, String delimiter) {
		String [] splitted = numberString.split(delimiter);
		List<Integer> numbers = new ArrayList<Integer>();

		for (String number : splitted) {
			if (number.contains("\n")) {
				numbers.addAll(splitNumberString(number, "\n"));
			} else {
				numbers.add(Integer.valueOf(number));
			}
		}

		return numbers;
	}
	
	private static int sumNumbers (List<Integer> numbers) {
		Integer result = numbers.stream().reduce(0, (Integer sum, Integer n) -> sum += n);
		return result;
	}
	
	private static void checkForNegativeNumbers (List<Integer> numbers) {
		List<Integer> negativeNumbers = numbers.stream().filter((Integer n) -> n < 0).collect(Collectors.toList());
		if (!negativeNumbers.isEmpty()) {			
			throw new NumberFormatException("negatives not allowed " + negativeNumbers.toString());
		}
	}
}
