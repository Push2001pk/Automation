package Pop_Ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/browser?sublist=0");
		
		driver.findElement(By.linkText("Open in new window")).click();
		
		Thread.sleep(2000);
		
		 Set<String> windowids=driver.getWindowHandles();
		 
		 for(String id:windowids)
			 
		 {   driver.switchTo().window(id);
			 String currentwindowTitle=driver.getTitle();
			 if(currentwindowTitle.contains("new Window"))
			 {
				 driver.switchTo().frame(0);
				 driver.findElement(By.id("username")).sendKeys("admin");
				 Thread.sleep(3000);
				 driver.close();
			 }
			 
		 }
		
		
		
		

	}

}
