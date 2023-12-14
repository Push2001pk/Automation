package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) 
	{
	   ChromeDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://www.myntra.com/");
	   
	   WebElement MenOption=driver.findElement(By.xpath("//a[text()='Men']"));
	   
	    Actions action=new Actions(driver);
	    
	    action.moveToElement(MenOption).perform();

	}

}
