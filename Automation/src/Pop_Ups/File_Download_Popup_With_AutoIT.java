package Pop_Ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class File_Download_Popup_With_AutoIT {

	public static void main(String[] args) throws IOException  
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/download?sublist=0");
		
		driver.findElement(By.name("textarea")).sendKeys("Raghav");
		driver.findElement(By.id("downloadButton")).click();
		Runtime.getRuntime().exec("D:\\SciteData\\FileDownload.exe");

	}

}
