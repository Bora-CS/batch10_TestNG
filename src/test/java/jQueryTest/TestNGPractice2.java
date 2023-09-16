package jQueryTest;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice2 {
	
	
	
	
	@Test
	public void a1() {
		System.out.println("This is a1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "a1", alwaysRun = true)
	public void a2() {
		System.out.println("This is a2");
	}	
	
	@Test()
	public void a3() {
		System.out.println("This is a3");
//		throw new Exception("");
	}	
	
	

}
