package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class NewClass{
	
	
	@Test
	public void test5()
	{
		Assert.assertTrue(true);
		System.out.println("test5 passed");
	}
	
	
	@Test
	public void test6()
	{
		Assert.assertTrue(true);
		System.out.println("test6 passed");
		
	}
	
	@Test
	public void extraTest()
	{
		Assert.assertTrue(true);
		System.out.println("ExtraTest passed");
	}
	
	

}
