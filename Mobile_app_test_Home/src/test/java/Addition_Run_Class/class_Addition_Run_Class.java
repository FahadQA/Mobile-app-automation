package Addition_Run_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Addition.class_Addition;
import App_Run_Customization.class_App_Run_Customization;

public class class_Addition_Run_Class {
	
	
	
class_Addition addition = new class_Addition();

    
//@BeforeTest
//public void open_App_in_Device() throws Exception
//{
//	customization.Customization_Functionality();
//	System.out.println("app is running on device");
//}



@Test
public void run_class_Addition() throws Exception 
{

		addition.Addition_Exicution();
}

}
