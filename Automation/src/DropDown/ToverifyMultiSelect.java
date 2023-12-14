package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToverifyMultiSelect {

	public static void main(String[] args)
	{
		 ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://demoapps.qspiders.com/dropdown/multiSelect");
	       
	       WebElement countryDropdownMulti = driver.findElement(By.id("mul"));
	       
	       Select select=new Select( countryDropdownMulti) ;
	       boolean multi=select.isMultiple();
	       
	       if(multi)
	       {
	    	   System.out.println("Pass: The dropdown is multiselect.");
	       }
	       else
	       {
	    	   System.out.println("Fail: The dropdown is not multiselected.");
	       }
	}

}
