package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Something wrong in this program.
public class Verify_How_to_click_link {

	public static void main(String[] args) throws InterruptedException 
	{
          ChromeDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://demoapps.qspiders.com/link");
          
          Thread.sleep(3000);
          
          //WebElement HowToClickLink=driver.findElement(By.xpath("//p[text()='How to Click on a Link text which open in new tab']"));
         
          //HowToClickLink.click();
         
          //Thread.sleep(3000);
         
         //boolean HowToClickLink1=driver.findElement(By.xpath("//span[text()='How to Click on a Link text which open in new tab']")).isDisplayed();
         
         boolean HowToClickLink1=driver.findElement(By.xpath("//aside[@class='bg-[white]  m-[1px] w-[99%] mx-auto my-0 flex justify-between items-center h-[30px] rounded-full cursor-pointer ']")).isDisplayed();
         
         
         Thread.sleep(2000);
         
         if(HowToClickLink1)
         {
        	 System.out.println("Pass:- ");
         }
         else
         {
        	 System.out.println("Fail:-");
         }
      
	}

}
