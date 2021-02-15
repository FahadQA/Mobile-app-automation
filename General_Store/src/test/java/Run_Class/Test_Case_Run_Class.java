package Run_Class;

import org.testng.annotations.*;

import Base_Class.Base_class;
import Test_Casae_02.Test_Case_02;
import Test_Case_01.Test_Case_01;
import Test_Case_03.Test_Case_03;

public class Test_Case_Run_Class
{
	Base_class base_class = new Base_class();
	Test_Case_01 test_case_01 = new Test_Case_01();
	Test_Case_02 test_case_02 = new Test_Case_02();
	Test_Case_03 test_case_03 = new Test_Case_03();
	
	@BeforeTest
	public void Base_Class_Run() throws InterruptedException
	{
		base_class.Base_Class_Exception();
		Thread.sleep(5000L);
	}
	
	@Test
	public void Test_Case_03_Run()
	{
		test_case_03.Test_Case_03_Functionality_Exception();
	}
	
}
 
