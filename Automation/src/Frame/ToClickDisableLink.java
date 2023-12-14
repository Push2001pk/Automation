package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickDisableLink 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		WebElement java = driver.findElement(By.name("q"));
		java.sendKeys("download java 11");
		java.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text()='Java SE 11 Archive Downloads']")).click();
	    driver.findElement(By.xpath("//a[@data-file='https://download.oracle.com/otn/java/jdk/11.0.20%2B9/78ca14fd6c8e40f8a74a1b7660c79db8/jdk-11.0.20_linux-aarch64_bin.rpm']")).click();
		
	    WebElement link=driver.findElement(By.xpath("//a[text()='Download jdk-11.0.20_linux-aarch64_bin.rpm']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
     	js.executeScript("arguments[0].click()",link);
	}

}
