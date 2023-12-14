package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreeShotWebElement {

	
		

			public static void main(String[] args) throws IOException 
			{
				 ChromeDriver driver=new ChromeDriver();
			       driver.manage().window().maximize();
			       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			       
			       driver.get("https://www.facebook.com/");
			       
			       File Source=driver.findElement(By.xpath("//IMG[@alt=\"Facebook\"]")).getScreenshotAs(OutputType.FILE);
			       File destination=new File("D:\\\\Eclipse Programs\\\\Selenium\\\\Automation\\\\ScreenShot//screensho.png");
			       
                   Files.copy(Source, destination);
	}

}
