package GenericUtils;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {
	WebDriver driver;
public WebDriverUtils(WebDriver driver) {
	this.driver = driver;
}
public void switchToWindowBasedTitle(String title) {
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
		if(driver.getTitle().equals(title)) {
			break;
		}
	}
}
public void switchToWindowBasedOnUrl(String url) {
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
		if(driver.getCurrentUrl().equals(url)) {
			break;
		}
	}
}
public void SwitchToAlertANdClickOnOk() {
driver.switchTo().alert().accept();	
}
public void switchToAlertAndClickOnCancel() {
	driver.switchTo().alert().dismiss();
}
 public String getAlertText() {
return driver.switchTo().alert().getText();
}
public void passVAlueForAlertTextBox(String date) {
	driver.switchTo().alert().sendKeys(date);
}
public void switchToFrame(int index) {
	driver.switchTo().frame(index);
}
public void switchToFrame(String nameOrId) {
	driver.switchTo().frame(nameOrId);
}
public void switchToFrame(WebElement ele) {
driver.switchTo().frame(ele);

}
public void switchToParentFrame() {
	driver.switchTo().parentFrame();
}
public void switchToDefaultContent() {
	driver.switchTo().defaultContent();
}
}
