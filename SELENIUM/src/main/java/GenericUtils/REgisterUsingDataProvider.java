package GenericUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class REgisterUsingDataProvider {
	@Test(dataProvider = "dataProviderMethod",dataProviderClass = DAtaprivider1.class )
	public void test(String firstname, String lastname, String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
	    driver.findElement(By.id("LastName")).sendKeys(lastname);
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.id("Password")).sendKeys(password);
	   driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
	   driver.findElement(By.id("register-button")).click();
	}

}
