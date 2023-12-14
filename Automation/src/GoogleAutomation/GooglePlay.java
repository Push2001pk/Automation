package GoogleAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePlay 
{
    public static void main(String[] args) 
    {
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://google.com");
	    
	    driver.findElement(By.className("gb_d")).click();
	    driver.switchTo().frame(1);
	    
	    driver.findElement(By.xpath("//span[text()='Play']")).click();
	    driver.findElement(By.xpath("//i[text()='search']")).click();
	    
	    
    }
}
