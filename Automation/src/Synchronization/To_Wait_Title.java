package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class To_Wait_Title {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
//		Thread.sleep(5000);
		
		
		
		password.sendKeys(Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
     	wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		String homePageTitle=driver.getTitle();
		  if(homePageTitle.contains("Enter Time-Track"))
		  {
			  System.out.println("Pass: The title is verified");
		  }
		  else
		  {
			  System.out.println("Fail: The title is not verified");
		  }

		

		
		
		
		
		

	}

}
