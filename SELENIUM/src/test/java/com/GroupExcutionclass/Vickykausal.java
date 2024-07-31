package com.GroupExcutionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vickykausal {
	@Test(groups = "Bollywood")
	public void excuteScript() {
		Reporter.log("vicky",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/vickykaushal09/?hl=en");
		driver.quit();
		
}

}
