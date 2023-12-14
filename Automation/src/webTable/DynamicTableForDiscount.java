package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableForDiscount 
{
	 public static void main(String[] args) 
	    {
	    	 ChromeDriver driver=new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		       
		       driver.get("https://demoapps.qspiders.com/table/dynamic-table");
		       
		       WebElement Discount=driver.findElement(By.xpath("//th[text()='Levis Shirt']/..//td[3]"));
		       
		       System.out.println(Discount.getText());
		       
		       
		       
		}
}
