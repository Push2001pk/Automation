package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAllId {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/link/linkNew");
		
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.linkText("Payments")).click();
		driver.findElement(By.linkText("Return Policy")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		System.out.println(allWindowIds);

	}

}
