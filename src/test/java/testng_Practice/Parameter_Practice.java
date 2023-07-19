package testng_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Practice {
	@Test
	@Parameters({ "Browser", "appUrl" })
	public void Browser_Launch(String Browser, String appUrl) {
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.get(appUrl);
			driver.manage().window().maximize();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.get(appUrl);
		}
	
		}
	
	@Test(priority = 1, groups="regression,bvt" ,enabled=false)
	public void logintest() {
		System.out.println("Login Succesful");

	}

	@Test(priority = 2, groups="regression,bvt" )
	public void logout() {
		System.out.println("Logout sucessful");
	}
	@Test (groups="bvt")
	public void test3() {
		System.out.println("test3 sucessful");
		

}}
