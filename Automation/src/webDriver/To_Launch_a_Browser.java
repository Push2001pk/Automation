package webDriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Launch_a_Browser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("opera");
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		

	}

}
