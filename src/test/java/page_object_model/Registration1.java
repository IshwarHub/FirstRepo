package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration1 {
	WebDriver driver;

	public Registration1(WebDriver driver) {
		this.driver = driver;

	}

	By searchbox = By.xpath("//*[@name='q']");
	By search_button = By.className("gNO89b");
	By Facebook_Link =By.className("x2VHCd OSrXXb ob9lvb");
	public void searchgoogle(String input) throws InterruptedException {
		driver.findElement(searchbox).sendKeys(input);
		Thread.sleep(2000);
		driver.findElement(search_button).click();
		//driver.findElement(Facebook_Link).click();
	}

}
