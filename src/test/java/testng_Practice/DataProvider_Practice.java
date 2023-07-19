package testng_Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practice {
	@Test(dataProvider ="LoginData_Provider")
	public void loginTest(String email,String password) {
		System.out.println(email +"  " +password);
		
	}
	@DataProvider(name="LoginData_Provider")
	public Object[][] getData(){
		Object[][] data= {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"}};
		return data;
		
	}

}
