package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Verify_Space {

	public static void main(String[] args) 
	{  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demoapps.qspiders.com/");
	  
	  Rectangle nameRect=driver.findElement(By.name("name")).getRect();
	  Rectangle emailRect=driver.findElement(By.name("email")).getRect();
	  Rectangle passwordRect=driver.findElement(By.name("password")).getRect();
		
	  int nameStarty=nameRect.getY();
	  int nameHeight=nameRect.getHeight();
	  
	  int nameEndY=nameStarty+nameHeight;
	  
	  int emailStarty=emailRect.getY();
	  
	  int SpaceBetweenNameAndEmail=emailStarty-nameEndY;
	  
	  System.out.println("The Space Between name and email is: " +SpaceBetweenNameAndEmail);
	  
	  int emailHeight=emailRect.getHeight();
	   
	  int emailEndY=emailStarty + emailHeight;
	  
	  int passwordStarty=passwordRect.getY();
	  
	  int SpaceBetweenEmailAndPassword=passwordStarty - emailEndY;
	  
	  System.out.println("The space between email and password is:  "+ SpaceBetweenEmailAndPassword);
	  
	  if(SpaceBetweenNameAndEmail==SpaceBetweenEmailAndPassword)
	  {
		  System.out.println("Pass: Space is verified");
	  }
	  else
	  {
		  System.out.println("Pass: Space is not verified");
	  }
	  

	}

}
