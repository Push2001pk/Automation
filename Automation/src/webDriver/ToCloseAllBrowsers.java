package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllBrowsers {

	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://demoapps.qspiders.com/link");
	   
	   driver.findElement(By.linkText("Link in New Tab")).click();
	   driver.findElement(By.linkText("Contact Us")).click();
	   
	   Thread.sleep(3000);
	   driver.quit();

	}

}
