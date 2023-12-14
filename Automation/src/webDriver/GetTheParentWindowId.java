package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheParentWindowId {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println(parentWindowId);
	}

}
