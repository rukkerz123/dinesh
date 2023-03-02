package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass { 
	public static  WebDriver driver ;  
	public static void launchbrowser () { 
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver ();
		
	} 
	public static void launchurl(String url) { 
		driver.get(url);
	} 
	public static void username(WebElement element  , String text) { 
		element .sendKeys(text);
	}  
	public static void password (WebElement element , String text) { 
		element.sendKeys(text);
	} 
	public static void  click (WebElement element) { 
		element.click();
	}
	
	

}
