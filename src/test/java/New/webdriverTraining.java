package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverTraining {
	public static void main(String[]args) {
		//System.setProperty("webdriver.chrome.driver","C:\\imp\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		
		  driver.manage().window().minimize();
		  driver.close();
		/* WebElement button=driver.findElement(By.xpath(""));
		 Actions act=new Actions(driver);
		 act.doubleClick(button).perform();// performs double click */

}
	}
