package org.manjunath.numbers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerReverse {
	private IntegerReverse reverse;

	@BeforeClass
	public void doInitialization() {
		reverse = new IntegerReverse();
	}

	@Test(testName = "testReverseForZero", alwaysRun = true)
	public void testReverseForZero() {
		Reporter.log("TestIntegerReverse: Strat of testReverseForZero() method", true);
		
		Assert.assertEquals(reverse.reverse(0), 0);
		
		Reporter.log("TestIntegerReverse: End of testReverseForZero() method", true);
	}

	@Test(testName = "testReverseForPositiveNum1", alwaysRun = true)
	public void testReverseForPositiveNum1() {
		Reporter.log("TestIntegerReverse: Strat of testReverseForPositiveNum1() method", true);
		
		Assert.assertEquals(reverse.reverse(123), 321);

		Reporter.log("TestIntegerReverse: End of testReverseForPositiveNum1() method", true);
	}

	@Test(testName = "testReverseForNegativeNum1", alwaysRun = true)
	public void testReverseForNegativeNum1() {
		Reporter.log("TestIntegerReverse: Strat of testReverseForPositiveNum1() method", true);
		
		Assert.assertEquals(reverse.reverse(-9854), -4589);

		Reporter.log("TestIntegerReverse: End of testReverseForPositiveNum1() method", true);
	}
	
	
	@Test(testName = "testReverseForInteger.MAX_VALUE", alwaysRun = true)
	public void testReverseForIntegerMaxValue() {
		Reporter.log("TestIntegerReverse: Strat of testReverseForIntegerMaxValue() method", true);
		Assert.assertEquals(reverse.reverse(Integer.MAX_VALUE), 0);
		Reporter.log("TestIntegerReverse: End of testReverseForIntegerMaxValue() method", true);
	}
	
	
	@Test(testName = "testReverseForInteger.MIN_VALUE", alwaysRun = true)
	public void testReverseForIntegerMinValue() {
		Reporter.log("TestIntegerReverse: Strat of testReverseForIntegerMinValue() method", true);
		Assert.assertEquals(reverse.reverse(Integer.MIN_VALUE), 0);
		Reporter.log("TestIntegerReverse: End of testReverseForIntegerMinValue() method", true);
	}

	@AfterClass
	public void doDestroy() {
		reverse = null;
	}
}
