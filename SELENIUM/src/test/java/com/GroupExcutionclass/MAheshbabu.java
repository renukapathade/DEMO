package com.GroupExcutionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MAheshbabu {
	@Test(groups = "tollywood")
	public void excuteScript() {
		Reporter.log("mahesh",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/urstrulymahesh/?hl=en");
		driver.quit();
		
}
}
