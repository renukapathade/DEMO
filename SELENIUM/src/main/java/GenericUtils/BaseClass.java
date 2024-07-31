package GenericUtils;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.internal.annotations.ITest;

import GroupExcutionclass.puneeth;
import elementRepository.BasePage;
import elementRepository.loginPage;

public class BaseClass implements IAutoConstants,ITestListener {
public  static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public loginPage lp;
	//public TakesScreenshot ts ;

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("beforesuite", true);
	}

	@BeforeTest
	public void beforetest() {
		Reporter.log("beforetest", true);
	}

	@Parameters("bname")
	@BeforeClass
	public void lunchingBrowser(@Optional("chrome") String browserName) {
		Reporter.log("beforeclass", true);

		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();

		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();

		else if (browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		
		bp = new BasePage(driver);
		lp = new loginPage(driver);
		flib = new FileLibrary();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));

	}

	@BeforeMethod
	public void navigateAndLoginToDWS() {
		Reporter.log("beforemethod", true);
		driver.get(flib.fetchDataFromProperties(PropertyFilePath, "url"));
		lp.getEmailTextBox().sendKeys(flib.fetchDataFromProperties(PropertyFilePath, "email"));
		lp.getPasswordTextBox().sendKeys(flib.fetchDataFromProperties(PropertyFilePath, "password"));
		lp.getLoginLink().click();

	}

	@AfterSuite
	public void aftersuite() {
		Reporter.log("aftersuite", true);
	}

	@AfterClass
	public void tearDownBrowser() {
		
		Reporter.log("afterclass", true);
		driver.close();
		//driver.quit();
	}

	@AfterMethod
	public void aftermethod() {
		Reporter.log("aftermethod", true);
		lp.getLogoutLink().click();
	}

	@AfterTest
	public void aftertest() {
		Reporter.log("aftertest", true);
	}
	
	//listeners
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Testcase --"+result.getName()+"--is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("[Testcase--"+result.getName()+"--is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Testcase--"+result.getName()+"--is failed");	
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt.toString().replace(":","_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotpath+"Screenshot.png");
		
		try {
		FileHandler.copy(src, dest);
	}catch (Exception e) {
		
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase--"+result.getName()+"--is skipped");	
		
	}

}
