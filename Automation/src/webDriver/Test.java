package webDriver;

import org.openqa.selenium.WebDriver;

public class Test {

	
	
		public static void googleTitle(WebDriver driver)
		{
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
	

}
