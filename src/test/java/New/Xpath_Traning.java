package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Traning {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("ish@gmail.com");
		driver.navigate().to("");
		
	}

}
