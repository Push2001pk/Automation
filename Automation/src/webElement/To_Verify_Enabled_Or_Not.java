package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Verify_Enabled_Or_Not 
 
{      
	  public static void main(String[] args) throws InterruptedException 
	  {
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demoapps.qspiders.com/");
		  
		  driver.findElement(By.name("name")).sendKeys("Raghav");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("email")).sendKeys("raghav2001rj@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys("Raghav1997#");
		  Thread.sleep(2000);
		  boolean registerButtonStatus=driver.findElement(By.xpath("//button[text()='Register']")).isEnabled();
		  
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//span[text()='Login']")).click();
		  
		  //if (registerButtonStatus)
		//  {
		//	  System.out.println("Pass:- The registration button is Enabled");
		 // }
		 // else
		 // {
			//  System.out.println("Fail:- The registration button is not Enabled");
		 // }
		  
	  }
		
	
      
}
