package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrameUsingWebElement {

	public static void main(String[] args) 
	{

		 ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("file:///C:/Users/pushp/Downloads/Frame2.html");
	       
	       driver.findElement(By.xpath("//iframe[@src='https://demoapps.qspiders.com/']"));
	       

	}

}
