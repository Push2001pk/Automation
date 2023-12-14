package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebpageScreenShot {

	public static void main(String[] args) throws IOException 
	{
		 ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://www.facebook.com/");
	       
	       TakesScreenshot ts=(TakesScreenshot)driver;
	       File source=ts.getScreenshotAs(OutputType.FILE);
	       File destination=new File("D:\\Eclipse Programs\\Selenium\\Automation\\ScreenShot//screenshot.png");
	       Files.copy(source, destination);
	       
	       
	}

}
