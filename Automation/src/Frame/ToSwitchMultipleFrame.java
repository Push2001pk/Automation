package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchMultipleFrame 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames/multiple");
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("username")).sendKeys("raghavrj");
		driver.findElement(By.id("email")).sendKeys("Raghav2001rj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Raghav2001#");
//		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("username")).sendKeys("raghavrj");
		driver.findElement(By.id("password")).sendKeys("Raghav2001#");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
		
	}

}
