package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable 
{
    public static void main(String[] args) 
    {
    
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/table/dynamic-table");
	
		WebElement price=driver.findElement(By.xpath("//th[text()='Levis Shirt']/parent::tr/child::td[3]"));
		
		System.out.println(price.getText());
	}
}
