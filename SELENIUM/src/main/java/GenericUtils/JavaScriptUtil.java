package GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil {
	WebDriver driver;
	JavascriptExecutor js;
	
	public JavaScriptUtils(WebDriver driver)  {
		this.driver=driver;
		js= (JavascriptExecutor)driver;
		
	}
	
	

}
