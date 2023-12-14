package AutoSuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePostman 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://web.postman.co/workspace/API_WORK~ad3c8f16-54f6-489c-8a65-99611dfca7ca/overview");

		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//span[@class='mark']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}


	}


