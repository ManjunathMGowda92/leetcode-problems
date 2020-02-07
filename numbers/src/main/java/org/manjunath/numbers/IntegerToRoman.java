package org.manjunath.numbers;

public class IntegerToRoman {
	
	/**
	 * Converts the given integer to Roman number Format. The range should be
	 * between 1 to 3999.
	 * 
	 * <br>
	 * <br>
	 * If the range is above 3999, then a RuntimeException will be thrown saying
	 * 'Number is above the range of Conversion.' 
	 * <br>
	 * If the range is below 0, then a RuntimeException will be thrown saying
	 * 'Number is below the range of Conversion.'
	 * 
	 * @param number Input number for Conversion
	 * @return Converted Roman Number
	 */
	public static String convertToRoman(int number) {
		if (number == 0 || number < 0)
			throw new RuntimeException("Number is below the range of Conversion. Should be between 1 to 3999");
		
		if (number > 3999)
			throw new RuntimeException("Number is above the range of Conversion. Should be between 1 to 3999");
		
		String[] digits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] thousands = {"", "M", "MM", "MMM"};
		
		/*
		 * (number / 1000) -> produces the 1000's place number
		 * (number % 100) / 100 -> produces the 100's place number
		 * (number % 100)/10 -> produces the 10's place number
		 * (number % 10) -> produces units place number
		 */
		
		return thousands[number / 1000] 
				+ hundreds[(number % 100) / 100] 
				+ tens[(number % 100)/10]
				+digits[(number % 10)];
	}
}
