package testng_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_practice {
	@Test
	public void VarifyTitle() {
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.ebay.com/e/row/editors-pickrow?_trkparms=%26clkid%3D676937867180414996");
		// String Expected_title = "Electronics, Cars, Fashion, Collectibles & More |
		// eBay";
		// String actual_Title = driver.getTitle();
		// Assert.assertEquals(actual_Title, Expected_title); // here result is not
		// match with expected
		// driver.close();

		// SOFT ASSERT
		SoftAssert  softas=new SoftAssert();
		driver.get("https://www.ebay.com/e/row/editors-pickrow?_trkparms=%26clkid%3D676937867180414996");
		String Expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String ExpectedText = "Search";
		
		
		String actual_Title = driver.getTitle();
		System.out.println("Varifying the Title");
		softas.assertEquals(actual_Title, Expected_title);

		String actualText = driver.findElement(By.xpath("//*[@value='Search']")).getAttribute("value");
		System.out.println("Verifying the Text");
		softas.assertEquals(ExpectedText, actualText);
		
		
		System.out.println("Closing the browser");
		driver.close();
		softas.assertAll();

	}

}
