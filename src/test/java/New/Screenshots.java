package New;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[]args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("URL");
		driver.manage().window().maximize();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
         File dest= new File("F:\\Velocity\\May-2021 Class\\Java\\Screenshot eg\\fbimage.png");
		
 // To store screenshot file we need file handler class and by using .copy () method we can store the file
         
		FileHandler.copy(source, dest);

		
		/* anouther method
		 * 
		 * 
		 * by genarating random string we can take multiple sctreenshots as file name is always different
		 * 
String str=RandomString.make(3);//to add random string this will avoid overrwriting of file
		
		File dest= new File("F:\\Velocity\\May-2021 Class\\Java\\Screenshot eg\\fbimage"+str+".png");
		
		FileHandler.copy(source, dest);
   */

		
	}

}
