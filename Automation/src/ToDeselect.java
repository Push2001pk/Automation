import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {

	public static void main(String[] args) throws InterruptedException 
	{

		   ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://demoqa.com/select-menu");
	       
	       
	       WebElement countryDropdownMulti = driver.findElement(By.id("cars"));
	       
	       Select select=new Select(countryDropdownMulti);
	       select.selectByIndex(2);
	       Thread.sleep(3000);
	       
	       select.selectByVisibleText("Audi");
	       Thread.sleep(3000);
	       
	       select.selectByValue("volvo");
	       
	       Thread.sleep(2000);
//	       
//	       select.deselectByIndex(3);
//	       
//	       Thread.sleep(2000);
//	       select.deselectByVisibleText("Opel");
//	       
//	       Thread.sleep(2000);
//	       select.deselectByValue("volvo");
//	       select.deselectAll();
//	       
	      WebElement FirstSel= select.getFirstSelectedOption();
	      System.out.println(FirstSel.getText());
	      
	}

}
