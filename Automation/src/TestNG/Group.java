package TestNG;

import org.testng.annotations.Test;

public class Group 
{

	@Test(groups="smoke")
	public void eatFood() 
		{
			System.out.println("Eat Food");
		}
	
	@Test(groups="smoke")
	public void wearCloths() 
		{
			System.out.println("Wear cloths");
		}
	
	@Test(groups="smoke")
	public void education() 
		{
			System.out.println("Education");
		}
	
	@Test(groups="reg")
	public void buyCar() 
		{
			System.out.println("Buy a car");
		}
	
	@Test(groups="reg")
	public void goVacation() 
		{
			System.out.println("Go to vacation");
		}
}
