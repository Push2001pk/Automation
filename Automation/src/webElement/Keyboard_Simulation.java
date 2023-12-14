package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Simulation 
{
   public static void main(String[] args) throws InterruptedException
   {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  
	  WebElement username=driver.findElement((By.id("username")));
	  WebElement password=driver.findElement((By.name("pwd")));
	  
	  username.sendKeys("admin");
	  Thread.sleep(2000);
	  password.sendKeys("manager");
	  Thread.sleep(2000);
	  
	  password.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Users")).click();
	  Thread.sleep(3000);
	  String homePageTitle=driver.getTitle();
	  if(homePageTitle.contains("Enter"))
	  {
		  System.out.println("Pass: The title is verified");
	  }
	  else
	  {
		  System.out.println("pass: The title is not verified");
	  }
	  
	  
	  
   }
}
