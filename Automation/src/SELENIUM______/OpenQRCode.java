package SELENIUM______;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//some error in this

public class OpenQRCode {

	public static void main(String[] args) throws InterruptedException 
	{
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://student.qspiders.com/");
		  
		  driver.findElement(By.name("email")).sendKeys("pushpendra2001pk@gmail.com");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("password")).sendKeys("Royal2001#");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//span[text()='Open QRCode']")).click();
		  

	}

}
