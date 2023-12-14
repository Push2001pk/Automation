package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("buttonAlert2")).click();
		
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Prompt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(3000);
		
		String questin = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		System.out.println(questin);
		
		
	}

}
