package TestNG;

import org.testng.annotations.Test;

public class Priority 
{
   @Test //(priority=1)
   public void a()
   {
	   System.out.println("Hello");
   }
   
   @Test //(priority=2)
   public void b()
   {
	   System.out.println("hello");
   }
   
   @Test //(priority=3)
   public void e()
   {
	   System.out.println("Hell");
   }
   
   @Test //(priority=4)
   public void c()
   {
	   System.out.println("Hello");
   }
}
