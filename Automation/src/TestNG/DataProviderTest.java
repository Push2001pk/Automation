package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest
{
   @Test(dataProvider= "data")
   public void food(String city,String food)
   {
	   System.out.println("Come to "+city+" and eat "+food+"");
   }
   
   @DataProvider
   public Object[][] data()
   {
	  
	  //Object[][] arr={{"Noida","Delhi","Gurgaon","Banglore"},{"Chaap","Parathe","Lassi","Coffee"}};
	   
	   Object[][] arr=new Object[1][2];
	   arr[0][0]="Noida";
	   arr[0][1]="Chaap";
	   return arr;
   }
}
