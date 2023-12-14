package Date_Picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Disable_Date_Picker 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/datePick/iconstrigger?scenario=1&sublist=2");
		
		 driver.findElement(By.xpath("//ARTICLE[.='Icon Date picker']/descendant::*[local-name()='svg' and normalize-space(@fill)='currentColor']")).click();
         String YM="December 2025";
         String D="25";
         
         while(true)
         {
               WebElement CYM = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
               if(YM==CYM.getText())
               {
            	   break;
               }
               driver.findElement(By.xpath("//span[text()='Next Month']")).click();
         }
        
	}

}
