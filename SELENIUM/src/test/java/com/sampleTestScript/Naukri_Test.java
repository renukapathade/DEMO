package com.sampleTestScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukri_Test {
	@Test
	public void executeScript() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.close();
	}

}
