package com.GroupExcutionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class yash {
	@Test(groups = {"KFI","pan India"})
	public void excuteScript() {
		Reporter.log("yash",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/thenameisyash/?hl=en");
		driver.quit();
	}	
}
