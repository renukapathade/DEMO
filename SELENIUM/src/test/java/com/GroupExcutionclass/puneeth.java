package com.GroupExcutionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class puneeth {
	@Test(groups = "KFI")
	public void excuteScript() {
		Reporter.log("puneeth",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/puneethrajkumar.official/?hl=en");
		driver.quit();
	}	

}
