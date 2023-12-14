package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2 
{

	@Test
	public void Test1()
	{
		 ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://demoapps.qspiders.com/dropdown");
	       
	       WebElement countryDropdown = driver.findElement(By.id("select3"));
	       
	       Select select = new Select(countryDropdown);
	       List<WebElement> allOptions=select.getOptions();
	       
	       int noOfOptions=allOptions.size();
	       
	       System.out.println("The total no of Options:--  "+noOfOptions);
	       
	       for(WebElement option:allOptions)
	       {
	    	   System.out.println(option.getText());
	       }
	       System.out.println("====================================");
	}
	
	
	
	@Test
	public void Test2() throws InterruptedException
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
	
	@Test
	public void Test3()
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
	
	@Test
	public void Test4()
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
	
	@Test
	
	public void Test() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.kwokyinmak.com/");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)");
	}
	
	
}
