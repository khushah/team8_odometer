

import java.util.ArrayList;

public class Odometer {
	private static final int START_DIGIT = 1;
	private static final int LAST_DIGIT = 9;
	private ArrayList<Integer> listOfNumbers;
	private char[] number;
	private int numberOfDigits;

	public Odometer(int numberOfDigits) {
		this.numberOfDigits = numberOfDigits;
		findNumbers(numberOfDigits);
	}
	
	
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

	public int nextValue(int value)
	{
		int index = listOfNumbers.indexOf(value);
		return listOfNumbers.get((index+1)%listOfNumbers.size());
	}
	
	public int previousValue(int value)
	{
		int index = listOfNumbers.indexOf(value);
		if(index == 0)
		{
			index = listOfNumbers.size()-1;
		}
		else
		{
			index = index - 1;
		}
		return listOfNumbers.get(index);
	}
}