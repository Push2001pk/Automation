package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_Button_Text_To_Be_Start 
{
     public static void main(String[] args) throws InterruptedException 
     {
    		ChromeDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    		driver.get("https://demoapps.qspiders.com/progress");
    		
    		WebElement startButton=driver.findElement(By.xpath("//button[text()='Start']"));
    		
    		WebElement resetButton=driver.findElement(By.xpath("//button[text()='Reset']"));
    		
    		startButton.click();
    		
    		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    		wait.until(ExpectedConditions.textToBePresentInElement(startButton, "Start"));
    		
    		Thread.sleep(2000);
    		
    		resetButton.click();
    		
    		
	}
}
