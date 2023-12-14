package webDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenANewTab {

	public static void main(String[] args) 
	{
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/link/linkNew");
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.navigate().to("https://www.google.com/");
	    
	    String childBrowserTitle = driver.getTitle();
	    
	    System.out.println(childBrowserTitle);
	    
	    
	}

}
