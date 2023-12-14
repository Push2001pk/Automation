package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Click_On_Any_Suggestion 
{

	public static void main(String[] args) 
	{
		String suggestionToClick= "hadh kar di aapne song";
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("hadh kar di aapne");
		
		List<WebElement> allSuggestion=(List<WebElement>) driver.findElements(By.xpath("//div[contains(@aria-label, 'hadh kar di aapne')]"));
		
		for(WebElement sugg:allSuggestion)
		{
			if(sugg.getText().contains(suggestionToClick))
			{
				sugg.click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[@class=\"hDVnsf z1asCe\"]")).click();
		
	}

}
