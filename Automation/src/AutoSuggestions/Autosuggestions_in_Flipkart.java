package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestions_in_Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
   
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");

	driver.findElement(By.name("q")).sendKeys("mobiles");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
 	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[@class='_3D0G9a']")));
 	
 	Thread.sleep(1); 	
	List<WebElement> allsuggestion=driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
	
	
	
	for(WebElement sug:allsuggestion)
	{
		System.out.println((sug.getText()));
	}
	
	}

}
//mobiles 5g
//in Mobiles
//mobiles
//in Mobiles
//mobiles realme
//mobiles 5g vivo
//smartwatch
//mobiles samsung
//mobile stand
//mobiles oneplus
