package ActionClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveByOffset 
{

	public static void main(String[] args) 
	{
	   ChromeDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://demoapps.qspiders.com/");
	   
	   Actions action=new Actions(driver);
	   action.moveByOffset(60, 37).click().perform();
	}

}
