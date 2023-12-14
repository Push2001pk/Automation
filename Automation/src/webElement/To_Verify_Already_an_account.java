package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//something wrong in this.

public class To_Verify_Already_an_account 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/");
	 
	 driver.findElement(By.xpath("//a[text()='Already have an account ? Login Now']")).click();
	 
	 Thread.sleep(2000);
	 
	WebElement Email=driver.findElement(By.name("email"));
	
	Email.sendKeys("Raghav2001rj@gmail.com");
	 
	 Thread.sleep(2000);
	 
	 WebElement Password=driver.findElement(By.name("password"));
	 Password.sendKeys("Raghav1234#");
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
   }
}