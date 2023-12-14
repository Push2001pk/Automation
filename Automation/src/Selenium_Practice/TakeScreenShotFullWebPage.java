package Selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotFullWebPage 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https:\\google.com");
	Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Eclipse Programs\\Selenium\\Automation\\ScreenShot\\fullScreeShotq.png");
		Files.copy(source, destination);

	}

}
