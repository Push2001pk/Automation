package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest 
{
	@Test
	public void GoogleTest()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Google.com");
				
	}

}
