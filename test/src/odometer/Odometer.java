package odometer;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;

public class Odometer {
	private static final int START_DIGIT = 1;
	private static final int LAST_DIGIT = 9;
	private ArrayList<Integer> listOfNumbers;
	private char[] number;

	public ArrayList<Integer> findNumbers(int numberOfDigits) {
		number = new char[numberOfDigits];
		listOfNumbers = new ArrayList<Integer>();
		generateNumbers(START_DIGIT, 0, numberOfDigits);
		return listOfNumbers;
	}

	private void generateNumbers(int startNumber, int index, int numberOfDigits) {
		if (numberOfDigits == 0) {
			listOfNumbers.add(convertCharacterArrayToInteger(number));
			return;
		}
		for (int i = startNumber; i <= LAST_DIGIT; i++) {
			number[index] = convertIntegerToCharacter(i);
			generateNumbers(i + 1, index + 1, numberOfDigits - 1);
		}
	}

	private Integer convertCharacterArrayToInteger(char[] number) {
		return Integer.parseInt(String.valueOf(number));
	}

	private Character convertIntegerToCharacter(Integer num) {
		return (char) (num + '0');
	}

}
