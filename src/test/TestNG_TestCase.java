package test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtentFactory;
import model.TestFields;
import page.SearchPageFactory;
import utilities.ReadFromCsv;
import utilities.Screenshots;

public class TestNG_TestCase {

	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;
	ReadFromCsv read = new ReadFromCsv();
	ExtentReports report;
	ExtentTest test;
	@SuppressWarnings("static-access")
	List<TestFields> fields = read.readFieldsFromCsv("src\\utilities\\fields.csv");

	@BeforeClass
	@Parameters({"browser"})
	public void beforeClass(String browser) {

		baseUrl = "https://formfaca.de/sm/lFnEJPB9T";
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Job App.");
		searchPage = new SearchPageFactory(driver);
		test.log(LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
		driver.get(baseUrl);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Web application opened");
	}

	
	@Test
	//@Parameters({"position"})
	public void test(/*int position*/) throws InterruptedException, AWTException, IOException {

		 searchPage.nameTextBox(fields.get(0).getName());
		 searchPage.emailTextBox(fields.get(0).getEmail());
		 searchPage.phoneTextBox(fields.get(0).getPhone());
		 searchPage.experienceRadioButton(fields.get(0).getExperience());
		 searchPage.positionDropBox(fields.get(0).getPosition());
		 searchPage.uploadFile(fields.get(0).getFile());
		 searchPage.clickSubmitButton();
		 test.log(LogStatus.INFO, "Clicked Submit button");

		Assert.assertTrue(driver.findElements(By.xpath("//button[contains(text(),'Create your own form')]")).size() != 0);
		test.log(LogStatus.PASS, "Verified Required field");
	}
	
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verify Required field Failed", imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
		test.log(LogStatus.INFO, "Test finished");
	}

	/*@AfterClass
	public void afterClass() {
		
		driver.quit();
		report.endTest(test);
		report.flush();
	}*/

}
