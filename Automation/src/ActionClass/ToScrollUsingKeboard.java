package ActionClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScrollUsingKeboard {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://www.selenium.dev/");
	       
	       Actions action=new Actions(driver);
	       action.sendKeys(Keys.PAGE_DOWN).perform();
	       Thread.sleep(5000);
	       action.sendKeys(Keys.END).perform();
	}

}
