package practice_Testng;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite (groups="regression")
	public void test1() {
		Reporter.log("method test1 is running", true);

	}

	@Test(enabled = true,groups="sanity")
	public void test2() {
		Reporter.log("method test2 before test is running", true);
	}

	@Test(enabled = true)
	public void test3() {
		Reporter.log("method test3 is running");
	}

	@Test(groups="sanity")
	public void test4() {
		Reporter.log("method  test 4  before method is running",true);
	}

}
