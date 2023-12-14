package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https:\\google.com");
		
		File source = driver.findElement(By.xpath("//img[@alt='Google']")).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\Eclipse Programs\\Selenium\\Automation\\ScreenShot\\screeshot2.png");
	
        Files.copy(source, destination);
	}

}
