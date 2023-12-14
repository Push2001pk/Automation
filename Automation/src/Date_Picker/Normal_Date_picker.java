package Date_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_Date_picker {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/datePick?sublist=0");
		
		WebElement a = driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
		a.sendKeys("15/05/2001");
		a.sendKeys(Keys.ENTER);
	}

}
