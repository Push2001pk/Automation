package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser 
{
	WebDriver driver;
	@Parameters("browser")
	public void facebookTest(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
					
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https:\\facebook.com");
		
		
	}
	@Test
	public void Google()
	{
		driver.get("https:\\facebook.com");
	}

}
