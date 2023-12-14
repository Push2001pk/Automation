package webElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_CSS_Info {

	public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoapps.qspiders.com/button");
		  
		  WebElement YesButton=driver.findElement(By.xpath("//button"));
				  
		  String YesButtonColorBeforeClick=YesButton.getCssValue("background-color");
		  
		  System.out.println(YesButtonColorBeforeClick);
		  
		  YesButton.click();
		  
		  String YesButtonColorAfterClick=YesButton.getCssValue("background-color");
		  
		  System.out.println(YesButtonColorAfterClick);
		  
		  if(!YesButtonColorBeforeClick.equals(YesButtonColorAfterClick))
		  {
			  System.out.println("Pass:- The button was clicked");
		  }
		  else
		  {
			  System.out.println("Fail:- The button was not clicked");
		  }
		  
		  

	}

}
