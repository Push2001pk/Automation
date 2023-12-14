package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL {

	public static void main(String[] args)
	{
		
		/*
		 * 1:-Launch the browser
		 * 2:-Navigate to google.com
		 * 3:-Verify whether the URL is correct
		 */
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.google.com/");
       
       String currentURL=driver.getCurrentUrl();
       System.out.println(currentURL);
	}

}
