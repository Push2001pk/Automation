package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Verify_A_Tootip_text {

	public static void main(String[] args) throws InterruptedException 
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapps.qspiders.com/");
	  
	  driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
	  
	  Thread.sleep(2000);
	  
	  String nameTextBoxToolTip=driver.findElement(By.name("name")).getAttribute("title");
	  
	  System.out.println(nameTextBoxToolTip);
	  Thread.sleep(4000);
	  
	  String emailTextBoxToolTip=driver.findElement(By.name("email")).getAttribute("title");//.getTagname();
	  
	  System.out.println(emailTextBoxToolTip);
	

	}

}
