package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class To_sign_in_GitHub {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		
	    WebElement button=driver.findElement(By.xpath("//a[@class='color-fg-on-emphasis']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		button.click();
		
		driver.findElement(By.name("login")).sendKeys("Raghav2001rj");
		
		driver.findElement(By.name("password")).sendKeys("Royal2001#");
		
        WebElement button1=driver.findElement(By.name("commit"));
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(button1));
		
		button1.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@class='avatar circle']")).click();

	}

}
