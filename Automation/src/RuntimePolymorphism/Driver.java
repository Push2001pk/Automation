package RuntimePolymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) throws InterruptedException 
	{
		 Test.googleTitle(new ChromeDriver());
		 System.out.println("The title is verified on Chrome");
		 
		 Test.googleTitle(new EdgeDriver());
		 System.out.println("The title is verified on Edge");
		 
		 Thread.sleep(2000);
		 
		 Test.googleTitle(new FirefoxDriver());
		 System.out.println("The title is verified on FireFox");
	}

}
