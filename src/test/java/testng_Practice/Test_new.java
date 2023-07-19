package testng_Practice;

import org.testng.annotations.Test;

public class Test_new {
	@Test(priority=1,description="This is login test")
	public void logintest() {
		System.out.println("Login Succesful");

	}
	@Test(priority=2, description="This is login test")
	public void logout() {
		System.out.println("Logout sucessful");
	}

}
