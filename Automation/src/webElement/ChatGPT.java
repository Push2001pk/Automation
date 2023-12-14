package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGPT 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.openai.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='New Chat']"));
		
	}

}
