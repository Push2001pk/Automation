package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrame {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Frame1.html");
		
        driver.switchTo().frame("raghav");
        
        
        driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	}

}
