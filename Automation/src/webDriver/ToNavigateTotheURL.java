package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateTotheURL {
/**
 * WebDriver: It is an interface which has 11+ abstract methods to handle the web browser.
 * WebDriver interface is used to  either perform action on the web browser to retrieve some information from the browser.
 * The different methods of WebDriver are:-
 * 1:- get(): 1. this method is used to navigate to the main URL.
 *            2. to the get method you have to always pass the fully qualified URL.
 *            3. get() will always wait for the page to get loaded
 *            4.the return type get() is void.
 *            5. it takes String type argument
 *            
 * Invalid argument exception:-It is an unchecked exception of selenium which occurs
 *                             when protocol is not             
 * 
 */
	public static void main(String[] args) 
	{
	  ChromeDriver driver = new ChromeDriver();
	  //1:- Launching an empty browser
	  driver.get("https://www.selenium.dev/");
      //2:- navigating to the main URL
	}

}
