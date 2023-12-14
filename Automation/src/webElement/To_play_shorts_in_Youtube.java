package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_play_shorts_in_Youtube {

	public static void main(String[] args) throws InterruptedException 
	{  
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("(//yt-formatted-string[@class=\"title style-scope ytd-guide-entry-renderer\"])[2]")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("(//yt-formatted-string[@class=\"title style-scope ytd-guide-entry-renderer\"])[4]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//yt-formatted-string[text()=\"Trending\"]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[text()='Music']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//yt-formatted-string[text()='KALAASTAR - Full Video | Honey 3.0 | Yo Yo Honey Singh & Sonakshi Sinha | Zee Music Originals']")).click();
        
       // Thread.sleep(2000);
        
       // driver.findElement(By.id("search-input")).sendKeys("jai shree ram");
	}

}
