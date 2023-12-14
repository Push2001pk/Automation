package webDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToPerformWindowOperations {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension WebPage=driver.manage().window().getSize();
		
		int width=WebPage.getWidth();
		
		int height=WebPage.getHeight();
		
		System.out.println(WebPage);
		

		Thread.sleep(2000);
		
		Dimension newDim=new Dimension(800,300);
		
		driver.manage().window().setSize(newDim);
		
		Thread.sleep(2000);
		
        Point P=driver.manage().window().getPosition();
        
        System.out.println(P);
        
        int x=P.x;
        int y=P.y;
        System.out.println("X cooordinate is:- "+x);
        System.out.println("y cooordinate is:- "+y);
        
        Thread.sleep(3000);
        
        Point newPos=new Point(100,120);
        
        driver.manage().window().setPosition(newPos);
		

		
		

	}

}
