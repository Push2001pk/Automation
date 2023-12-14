package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest 
{

	@Test
	public void FaceBookTest()
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
				
	}
}
