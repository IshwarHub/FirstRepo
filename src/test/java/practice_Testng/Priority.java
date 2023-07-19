package practice_Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void priorityTest() 
	{
		Reporter.log("Priority 1 is running",true);
	}
	@Test(priority=2)
	public void prioriyTest2()
	{
		Reporter.log("priority 2 is running",true);
	}
	@Test(enabled=false ,priority=3)
	public void priorityTest3()
	{
		Reporter.log("priority 3 is running",true);
	}


}
