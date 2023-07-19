package practice_Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=5)
	public void test_invocation_count()
	{
		Reporter.log("invocation count running",true);
	}

}
