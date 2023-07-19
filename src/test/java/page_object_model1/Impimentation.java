package page_object_model1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_object_model.Registration1;

public class Impimentation {
	WebDriver driver;
	@BeforeTest
	public void Before_Test() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}
	@Test
	public void searchoperation() throws InterruptedException {
		Registration1 page=new Registration1(driver);
		page.searchgoogle("Facebook");
		Thread.sleep(2000);
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(Registration1.searchbox));
		
	}
	

	@AfterTest
	public  void After_Test() {
		driver.quit();
	}

}
