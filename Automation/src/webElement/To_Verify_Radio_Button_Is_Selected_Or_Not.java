package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Verify_Radio_Button_Is_Selected_Or_Not 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demoapps.qspiders.com/radio");
	  
	  WebElement radiobutton=driver.findElement(By.name("Attended"));
	  
	  radiobutton.click();
	  
	  boolean statusOfRadioButton=radiobutton.isSelected();
	  System.out.println(statusOfRadioButton);
	  
	  Thread.sleep(3000);
	  
      WebElement radiobuttonDilivery=driver.findElement(By.name("Willing"));
	  
	  radiobuttonDilivery.click();
	  
	  Thread.sleep(3000);
	  
	  WebElement clickContinue= driver.findElement(By.xpath("//button[text()='Continue']"));
	  
	  clickContinue.click();
	  
	  //if(statusOfRadioButton)
	  //{
		//  System.out.println("Pass:- The Radio Button Is Selected");
	  //}
	 // else
	  //{
		//  System.out.println("Fail:- The Radio Button is not Selectd");
	 // }
   }
}
