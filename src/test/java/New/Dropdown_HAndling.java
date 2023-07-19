package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_HAndling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();

		WebElement drpdown = driver.findElement(By.id("first"));
		Select selobj = new Select(drpdown);
		selobj.selectByValue("Google");
	//	selobj.selectByIndex(2);
	//	selobj.selectByVisibleText("Yahoo");
		
		
		

		WebElement dropdown = driver.findElement(By.className("col-lg-3"));
		Select selobj1 = new Select(dropdown);
		// selobj1.selectByValue("Donut");
		// Thread.sleep(2000);
		selobj1.selectByIndex(3);
		Thread.sleep(2000);
		List<WebElement> alloption = selobj1.getAllSelectedOptions();
		System.out.println(alloption.size());

		selobj1.deselectAll();
	}

}
