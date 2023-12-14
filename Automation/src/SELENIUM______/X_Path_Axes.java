package SELENIUM______;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_Axes
{
   public static void main(String[] args) 
   {
   ChromeDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.amazon.in/s?k=samsung+mobiles&i=electronics&crid=141LUVQFE2ERS&sprefix=samsung+mobiles%2Celectronics%2C339&ref=nb_sb_noss_1");
   
   WebElement priceElement=driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 FE 5G (Purple, 8GB, 256GB Storage)']/ancestor::div[@class=\"a-section a-spacing-small puis-padding-left-small puis-padding-right-small\"]/descendant::span[text()='64,999']"));

   String price= priceElement.getText();
   System.out.println(price);
   }
}