package RuntimePolymorphism;
import org.openqa.selenium.WebDriver;

public class Test {

	
	
		public static void googleTitle(WebDriver driver)
		{
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			String title=driver.getTitle();
			
			if(title.contains("Google"))
			{
				System.out.println("Pass: The title is verified");
			}
			else
			
				System.out.println("Pass: The title is not verified");
			
			driver.quit();
		}
	

}

