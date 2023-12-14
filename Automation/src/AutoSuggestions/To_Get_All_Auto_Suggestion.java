package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_All_Auto_Suggestion 
{

	public static void main(String[] args) 
	{


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("hadh kar di aapne");
		
		List<WebElement> allSuggestion=(List<WebElement>) driver.findElements(By.xpath("//div[contains(@aria-label, 'hadh kar di aapne')]"));
		
		for(WebElement sug:allSuggestion)
		{
			System.out.println((sug.getText()));
		}
		

	}

}
