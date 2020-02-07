package org.manjunath.numbers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerToRoman {
	private IntegerToRoman obj;
	
	@BeforeClass
	public void doInitialization() {
		obj = new IntegerToRoman();
	}

	/*Start of Positive Test Cases*/
	@Test(testName = "testConvertToRoman1", 
		  description = "Convert the provided input number to Roman number",
		  alwaysRun = true)
	public void testConvertToRoman1() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman1() method", true);

		String str = obj.convertToRoman(143);
		Assert.assertEquals("CXLIII", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman1() method", true);
	}
	
	@Test(testName = "testConvertToRoman2", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman2() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman2() method", true);
		
		String str = obj.convertToRoman(3999);
		Assert.assertEquals("MMMCMXCIX", str);
		
		Reporter.log("TestIntegerToRoman: End of testConvertToRoman2() method", true);
	}
	
	@Test(testName = "testConvertToRoman3", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman3() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman3() method", true);

		String str = obj.convertToRoman(968);
		Assert.assertEquals("CMLXVIII", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman3() method", true);
	}
	
	@Test(testName = "testConvertToRoman4", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman4() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman4() method", true);

		String str = obj.convertToRoman(467);
		Assert.assertEquals("CDLXVII", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman4() method", true);
	}
	
	@Test(testName = "testConvertToRoman5", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman5() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman5() method", true);

		String str = obj.convertToRoman(1);
		Assert.assertEquals("I", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman5() method", true);
	}
	
	@Test(testName = "testConvertToRoman6", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman6() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman6() method", true);

		String str = obj.convertToRoman(5);
		Assert.assertEquals("V", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman6() method", true);
	}
	
	
	@Test(testName = "testConvertToRoman7", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman7() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman7() method", true);

		String str = obj.convertToRoman(9);
		Assert.assertEquals("IX", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman7() method", true);
	}
	
	@Test(testName = "testConvertToRoman10", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman10() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman10() method", true);

		String str = obj.convertToRoman(49);
		Assert.assertEquals("XLIX", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman10() method", true);
	}
	
	@Test(testName = "testConvertToRoman5", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman11() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman11() method", true);

		String str = obj.convertToRoman(99);
		Assert.assertEquals("XCIX", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman11() method", true);
	}
	
	@Test(testName = "testConvertToRoman5", 
			  description = "Convert the provided input number to Roman number",
			  alwaysRun = true)
	public void testConvertToRoman12() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRoman11() method", true);

		String str = obj.convertToRoman(999);
		Assert.assertEquals("CMXCIX", str);

		Reporter.log("TestIntegerToRoman: End of testConvertToRoman11() method", true);
	}
	/*Start of Positive Test Cases*/
	
	/* Start of Test cases for Negative Numbers*/
	@Test(testName = "testConvertToRomanForNegativeNumbers1",
			description = "Get exception when Number is less than zero",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForNegativeNumbers1() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForNegativeNumbers1() method", true);
		obj.convertToRoman(-135);
	}
	
	@Test(testName = "testConvertToRomanForNegativeNumbers2",
			description = "Get exception when Number is less than zero",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForNegativeNumbers2() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForNegativeNumbers2() method", true);
		obj.convertToRoman(-2456);
	}
	
	@Test(testName = "testConvertToRomanForNegativeNumbers4",
			description = "Get exception when Number is less than zero",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForNegativeNumbers4() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForNegativeNumbers4() method", true);
		obj.convertToRoman(-2);
	}
	/* Start of Test cases for Negative Numbers*/
	
	
	/* Start of Test case for Zero*/
	@Test(testName = "testConvertToRomanForNegativeNumbers2",
			description = "Get exception when Number is equal to zero",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForZero() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForZero() method", true);
		obj.convertToRoman(0);
	}
	/* End of Test case for Zero*/
	
	
	/*Start of Test cases for Numbers greater than 3999*/
	@Test(testName = "testConvertToRomanForNumberGreaterThanLimit1",
			description = "Get exception when Number is greater than 3999",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForNumberGreaterThanLimit1() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForNumberGreaterThanLimit1() method", true);
		obj.convertToRoman(4000);
	}
	
	@Test(testName = "testConvertToRomanForNumberGreaterThanLimit2",
			description = "Get exception when Number is greater than 3999",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForNumberGreaterThanLimit2() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForNumberGreaterThanLimit2() method", true);
		obj.convertToRoman(402342);
	}
	
	@Test(testName = "testConvertToRomanForNumberGreaterThanLimit3",
			description = "Get exception when Number is greater than 3999",
			alwaysRun = true,
			expectedExceptions = RuntimeException.class)
	public void testConvertToRomanForNumberGreaterThanLimit3() {
		Reporter.log("TestIntegerToRoman: Start of testConvertToRomanForNumberGreaterThanLimit3() method", true);
		obj.convertToRoman(9876);
	}
	/*End of Test cases for Numbers greater than 3999*/
	
	@AfterClass
	public void doDestroy() {
		obj = null;
	}
}
