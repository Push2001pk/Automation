package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths 
{
   public static void main(String[] args)
   {
	   ChromeDriver Driver=new ChromeDriver();
	   Driver.manage().window().maximize();
	  
	  Driver.get("file:///D:/New%20programs/raghav.html");
	  
	  WebElement btextbox = Driver.findElement(By.xpath("html/body/div[1]/input[1]"));
	  
	  btextbox.sendKeys("Qspiders");
   }
}
