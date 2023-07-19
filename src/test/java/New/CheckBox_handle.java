package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_handle {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup(); in new selenium no need to write this
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.xpath("//*[@type='checkbox'][@class='Automation']")).click();

	}

}
