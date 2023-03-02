package pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomclass { 
	@FindBy(xpath = "//input[@class ='input_error form_input']")
	public static WebElement username;


@FindBy(xpath = "//input[@type='password']")
public  static  WebElement  password ; 
@ FindBy(xpath = "//input[@type='submit']")
public static WebElement  click ;
}
