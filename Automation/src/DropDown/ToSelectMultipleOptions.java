package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectMultipleOptions {

	public static void main(String[] args) throws InterruptedException 
	{
		   ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://demoqa.com/select-menu");
	       
	       
	       WebElement countryDropdownMulti = driver.findElement(By.id("cars"));
	       
	       Select select=new Select( countryDropdownMulti) ;
	       select.selectByIndex(2);
	       Thread.sleep(3000);
	       
	       select.selectByVisibleText("Audi");
	       Thread.sleep(3000);
	       
	       select.selectByValue("volvo");
	       
	       List<WebElement> allSelected=select.getAllSelectedOptions();
	       int noOfSelectedOptions=allSelected.size();
	       
	       System.out.println(noOfSelectedOptions);
	       for(WebElement SelectedOption:allSelected)
	       {
	    	   System.out.println(SelectedOption.getText());
	       }
	       
	       
	}

}
