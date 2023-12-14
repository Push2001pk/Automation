package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Verify_Message_Displayed_Or_Not 
{
      public static void main(String[] args) throws InterruptedException 
      {
    	  ChromeDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("http://demoapps.qspiders.com/button");
    	  
    	  driver.findElement(By.xpath("//p[text()='1. Are you satisfied with registration process?']/..//button[text()='Yes']"));
    	  
    	  Thread.sleep(2000);
    	  
    	  boolean yesmsg=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
    	  
    	  if(yesmsg)
    	  {
    		  System.out.println("pass:- selected");
    		  
    	  }
    	  else
    	  {
    		  System.out.println("Fail:- Not selected");
    	  }
	  }
}
