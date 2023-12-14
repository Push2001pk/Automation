package TakeScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnDisableElement {

	public static void main(String[] args)
	{
		   ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://www.selenium.dev/");
	       
	       WebElement link=driver.findElement(By.linkText("About Selenium"));
	       
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click()",link);

	}

}
//Download Java 11