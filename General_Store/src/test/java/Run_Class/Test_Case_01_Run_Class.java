package Run_Class;

import org.testng.annotations.*;

import Test_Case_01.Test_Case_01;

public class Test_Case_01_Run_Class
{
	Test_Case_01 test_case_01 = new Test_Case_01();
	
	@BeforeTest
	public void Base_Class_Run() throws InterruptedException
	{
		test_case_01.Base_Class_Exception();
		Thread.sleep(5000L);
	}
	
	@Test
	public void Test_Case_01_Run()
	{
		test_case_01.Test_Case_01_Functionality_Exception();
	}
	
}
 
