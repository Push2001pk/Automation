package Pom_Repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementRefExc 
{

	public static void main(String[] args) 
	{


		   ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	        driver.get("https://google.com");
	        WebElement text = driver.findElement(By.name("q"));
	        
	        text.sendKeys("Animal");
	        
	        driver.navigate().refresh();
	        
	        text.sendKeys("Sam Bahadur");
	}

}
