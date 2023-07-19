package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Class {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@name='username'])")).sendKeys(" Admin");
    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//*[@type='submit']")).click();
    driver.close();
	}

}
