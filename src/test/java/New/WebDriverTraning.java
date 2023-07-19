package New;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class WebDriverTraning {
	 public static String browser="chrome";  // external configuration xls file
 	public static WebDriver driver; 
 	
     public static void main(String[]args) {
    	 if (browser.equals("chrome")) {
    		 WebDriverManager.chromedriver().setup();
    		 driver=new ChromeDriver();
    	 }
    	 else if(browser.equals("firefox")) {
    		 WebDriverManager.firefoxdriver().setup();
    		 driver=new FirefoxDriver();
    	 }
    	 
    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 driver.manage().window().maximize();
        
   
        
       
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.close();

	}
}
