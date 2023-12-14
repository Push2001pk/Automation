package BasicTestScript;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import Pom_Repo.GoogleHomePage;

public class SearchFimTest 
{

	public static void main(String[] args) 
	{

		   ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://google.com");
	       
           GoogleHomePage page=new GoogleHomePage(driver);
           page.searchbox.sendKeys("Animal");
           
           driver.navigate().refresh();
           
           page.searchbox.sendKeys("Sam Bahadur");
	}

}
