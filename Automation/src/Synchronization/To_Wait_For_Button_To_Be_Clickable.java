package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class To_Wait_For_Button_To_Be_Clickable {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		driver.findElement(By.id("email")).sendKeys("raghav2001rj@gmail.com");
		
		WebElement button=driver.findElement(By.cssSelector("button[data-continue-to='password-container']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		button.click();
		
		driver.findElement(By.id("password")).sendKeys("Raghav2001#");
		
		WebElement button1=driver.findElement(By.cssSelector("button[data-continue-to='username-container']"));
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.elementToBeClickable(button1));
        
        button1.click();
        
              
    	driver.findElement(By.id("login")).sendKeys("raghavrj123321");
    	
    	WebElement button2=driver.findElement(By.cssSelector("button[data-continue-to='opt-in-container']"));
    	
    	WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.elementToBeClickable(button2));
        
        button2.click();
        
        driver.findElement(By.id("opt_in")).sendKeys("n");  
        
        WebElement button3=driver.findElement(By.cssSelector("button[data-continue-to='captcha-and-submit-container']"));
        
        WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait3.until(ExpectedConditions.elementToBeClickable(button3));
        
        button3.click();
	}

}
