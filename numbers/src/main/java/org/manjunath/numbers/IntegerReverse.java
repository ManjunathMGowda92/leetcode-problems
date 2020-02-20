package org.manjunath.numbers;

public class IntegerReverse {

	/**
	 * To find the reverse of the given Integer.
	 * 
	 * @param num Input number for which reverese need to be find.
	 * @return Reversed integer
	 */
	public int reverse(int num) {
		int reverse = 0;
		

		/*
		 * Till the number is not equal to zero, divide the number by ten, get the
		 * remainder and sum the remainder to reversed number
		 */
		while (num != 0) {
			// get remainder of the number.
			int temp = num % 10;
			// get the quotient of number and assign to the number only
			num = num / 10;

			// check whether the reverse overflows the Integer limit
			if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && temp > 7))
				return 0;

			// check whether the reverse underflows the Integer limit
			if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && temp < -8))
				return 0;

			// multiply the reverse with 10 and add temp(remainder) to it
			reverse = (reverse * 10) + temp;
		}

		// return the reverse		
		return reverse;
	}
}
