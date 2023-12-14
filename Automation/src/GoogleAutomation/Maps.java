package GoogleAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {

		public static void main(String[] args) throws InterruptedException
		{
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.google.com/");
			driver.findElement(By.className("gb_d")).click();
			
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//span[text()='Maps']")).click();
			WebElement searchBox=driver.findElement(By.name("q"));
			searchBox.sendKeys("Noida");
			searchBox.sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("//button[@class='g88MCb S9kvJb ']")).click();
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']"));
			search.sendKeys("Nawabganj");
			Thread.sleep(3000);
			
			WebElement sugg=driver.findElement(By.xpath("(//div[@class='sbsb_c '])[1]"));
			sugg.click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@role='radio'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Details']")).click();
			
		
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@aria-label='Print']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Print text only']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()=' Print ']")).click();
			Thread.sleep(3000);
			
	     
			
			
			
		}}
		