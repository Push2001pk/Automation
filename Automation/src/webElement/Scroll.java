package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{
  public static void main(String[] args) 
  {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	
	driver.findElement(By.linkText("About Selenium")).click();
  }
}
