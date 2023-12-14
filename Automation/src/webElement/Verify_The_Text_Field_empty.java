package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_The_Text_Field_empty {

	public static void main(String[] args) throws InterruptedException 
	{
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demoapps.qspiders.com/");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[text()='Register']")).submit();
	    driver.findElement(By.xpath("//p[text()='Name is required']")).getText();
	    

	}

}
