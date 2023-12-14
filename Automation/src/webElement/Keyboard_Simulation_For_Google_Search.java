package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class Keyboard_Simulation_For_Google_Search 
{
    public static void main(String[] args) throws InterruptedException 
    {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/createaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmail.google.com&dsh=S2131181777%3A1697142952230825&ec=GAlAFw&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=mail&theme=glif&authuser=0");
		
		WebElement Search=driver.findElement((By.linkText("First name")));
		Thread.sleep(3000);
		
		Search.sendKeys("raghav");
		Thread.sleep(2000);
		Search.sendKeys(Keys.ENTER);
		
		
		
		
	}
}
