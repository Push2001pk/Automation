package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_Dimension {

	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demoapps.qspiders.com/image");
		  
		  Dimension imageDim = driver.findElement(By.xpath("//img[@alt='order placed']")).getSize();
		  
		  int imageWidth=imageDim.getWidth();
		  int imageHeight=imageDim.getHeight();
		  
		  System.out.println(imageWidth);
		  System.out.println(imageHeight);

	}

}
