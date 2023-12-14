package AutoSuggestions;
 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion_In_Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{  

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'mobiles')]")));
		
		List<WebElement> allSuggestion=(List<WebElement>) driver.findElements(By.xpath("//div[contains(@aria-label, 'mobiles')]"));
		
		
		
		for(WebElement sug:allSuggestion)
		{
			System.out.println(sug.getText());
		}
		
		
		
	}
	
}
//Output

//mobiles
//mobiles for bassinets
//mobiles for cribs
//mobiles for home decor
//mobiles for cribs for girls
//mobiles art hanging for adults
//mobiles 5g
//mobiles charger
//mobilesupply
//mobiles para cunas de bebe
