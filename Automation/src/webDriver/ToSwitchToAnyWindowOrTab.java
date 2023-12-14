package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAnyWindowOrTab {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/link/linkNew");
		
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.linkText("Payments")).click();
		driver.findElement(By.linkText("Return Policy")).click();
		
		Thread.sleep(3000);
		
		Set<String> allIds=driver.getWindowHandles();
		
		System.out.println(allIds);
		
		for(String id:allIds)
		{
			driver.switchTo().window(id);
			Thread.sleep(3000);
			if(driver.getTitle().contains("Payments"))
			{
//				driver.close();
				break;
			}
		}

	}

}
