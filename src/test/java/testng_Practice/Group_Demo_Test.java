package testng_Practice;

import org.testng.annotations.Test;

public class Group_Demo_Test {
	@Test(dataProvider ="LoginData_Provider ",dataProviderClass=DataProvider_Practice.class ,priority = 1, groups="regression,bvt")
	public void logintest() {
		System.out.println("Login Succesful");

	}
    
	@Test(priority = 2, groups="regression,bvt")
	public void logout() {
		System.out.println("Logout sucessful");
	}
	@Test (groups="bvt")
	public void test3() {
		System.out.println("test3 sucessful");
		
	}
	@Test(groups="bvt")
	public void test4() {
		System.out.println("test4 sucessful");
		
	}
	

}
