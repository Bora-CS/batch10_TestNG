package jQueryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {

	@Test(priority = 1)
	public void a1() {
		System.out.println("This is a1 test");
	}

	@Test(enabled = true)
	public void a2() {
		System.out.println("There is bug, This is a2 test");
		Assert.fail();

	}
	
	@Test(dependsOnMethods = "a2")
	public void a3() {
		System.out.println("If a2 passed, run this test");
	}

	@Test(priority = -1 , enabled = true   )
	public void b1() {
		System.out.println("This is b1 test");
	}

	@Test
	public void b2() {
		System.out.println("This is b2 test");
	}

}
