package TestNG;


import org.testng.annotations.Test;
import org.testng.Assert;


public class HardAssert
{
	@Test
	public void demo()
	{
		int a=420;
		int b=123;
		
	  Assert.assertEquals(a,b);
	  System.out.println("Pass");
	  
	}
	
	@Test
	public void demo1()
	{
		String a="Qspiders";
		String b="spiders";
		
		Assert.assertTrue(a.contains(b));
		System.out.println("Pass");
	}

}
