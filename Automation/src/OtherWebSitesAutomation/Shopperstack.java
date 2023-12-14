package OtherWebSitesAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopperstack 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveByOffset(517, 138).click().perform();
		
		driver.findElement(By.xpath("//DIV[contains(@class,'cat_box__FUszw')]/DIV[1]/DIV[3]/DIV[2]/BUTTON[.='add to cart']")).click();
	}

}
