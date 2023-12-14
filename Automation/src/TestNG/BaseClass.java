package TestNG;

import org.testng.annotations.*;

public class BaseClass 
{
   
	@BeforeSuite
	public void bs()
		{
			System.out.println("Database connection establish.");		
		}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Browser has been launched.");
		System.out.println("the url is navigated.");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("The user has been logged in.");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("The user has been logged out.");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("the browser has been closed.");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("The database connection is closed.");
		
	}
	
	
//	@Test
//	public void testcase()
//	{
//		System.out.println("The test script has run.");
//	}
	
	
}
