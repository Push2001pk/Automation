package Frame;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchNestedFrame {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames/nested");
		
//		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
//		WebElement outerframe=driver.findElement(By.xpath("//iframe[@title='Parent iframe']"));
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("username")).sendKeys("Raghav2001");
		driver.findElement(By.name("email")).sendKeys("raghav2001rj@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Raghav2001#");
		
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.tagName("span")).getText();
		System.out.println(text);
		

	}

}
