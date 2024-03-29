package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSwitcj 
{
   public static void main(String[] args) 
   {
	   ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       driver.get("https://demoapps.qspiders.com/dropdown");
       
       WebElement countryDropdown = driver.findElement(By.id("select3"));
       
       Select selectCountry=new Select(countryDropdown);
       
       selectCountry.selectByIndex(7);
       
       WebElement StateDropdown=driver.findElement(By.id("select5"));
       
       Select selectState=new Select(StateDropdown);
       
       selectState.selectByVisibleText("Uttar Pradesh");
       
   }
}
