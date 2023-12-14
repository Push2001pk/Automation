package Pop_Ups;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Using_Autoit 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        
        Runtime.getRuntime().exec("D:\\SciteData\\Naukari.exe");
		
	}

}
