package BasicTestScript;

import org.testng.annotations.Test;

import TestNG.BaseClass;

public class DemoClass1  extends BaseClass
{
    @Test
    public void testcase1()
    {
    	System.out.println("The test script 1 has run.");
    }
    
    @Test
    public void testcase2()
    {
    	System.out.println("The test script 2 has run.");
    }
}
