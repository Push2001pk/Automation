package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToComeOutsideFrame {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("file:///C:/Users/pushp/Downloads/Frame2.html");
	       
	       driver.switchTo().frame("something");
	       
	       driver.findElement(By.xpath("//span[text()='Downloads']"));
	       
	       driver.switchTo().defaultContent();
	       
	       driver.findElement(By.tagName("input")).click();
	       
	}

}
