package test;

import org.testng.annotations.Test;

public class TestNGException {

	@Test(expectedExceptions=ArithmeticException.class)
	public void testException()
	{
		System.out.println("Before exception");
		int i=1/0;
		System.out.println("After exception no failure");

	}
}
