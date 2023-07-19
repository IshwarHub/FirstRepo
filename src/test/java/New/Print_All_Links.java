package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_All_Links {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=1255127653044420441&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		driver.manage().window().maximize();
		List<WebElement> Alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are :" + Alltags.size());
		 for (int i=0;i<Alltags.size();i++) {
			 System.out.println("Links on the page are :"+Alltags.get(i).getAttribute("href"));
			 System.out.println("text of the link      :"+Alltags.get(i).getText());
		 }

	}

}
