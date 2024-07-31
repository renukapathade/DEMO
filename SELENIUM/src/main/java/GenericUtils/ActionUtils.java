package GenericUtils;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtils {
	Actions actions;
	
	public ActionUtils(WebDriver driver) {
		actions=new Actions(driver);
	}
	public void clickOnElement(WebElement ele) {
		actions.click().perform();
	}
	public void passDataForElement(WebElement ele, CharSequence... data) {
		actions.sendKeys(ele, data).perform();
	}
	public void mouseOverOnElement(WebElement ele) {
		actions.moveToElement(ele).perform();
	}
	public void doubleClickElemnt(WebElement ele) {
		actions.doubleClick(ele).perform();
	}
	public void rigthClickOnElement(WebElement ele) {
		actions.contextClick(ele).perform();
		
	}
	public void dragAndDropElement(WebElement arc,WebElement dest) {
		actions.dragAndDrop(arc, dest).perform();
	}
	public void dragAndDropElementByOffset(WebElement ele ,int Xoffset ,int yoffset) {
	actions.dragAndDropBy(ele, Xoffset, yoffset).perform();	
	}
	public void scrollBasedOnAxis(int Xoffset,int Yoffset) {
		actions.scrollByAmount(Xoffset, Yoffset).perform();
	}
	public void scrollUntilElementIsVisible(WebElement ele) {
		actions.scrollToElement(ele).perform();
	}
	public void scrollUntilElementVisible(WebElement ele,int Xoffset, int Yoffset) {
		ScrollOrigin origin = ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(null, Xoffset, Yoffset).perform();
	}
	
}
