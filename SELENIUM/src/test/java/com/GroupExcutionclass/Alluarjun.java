package com.GroupExcutionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Alluarjun {
	@Test(groups = {"tollywood","pan India"})
	public void excuteScript() {
		Reporter.log("allu arjun",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/alluarjunonline/?hl=en");
		driver.quit();
		
}
}
