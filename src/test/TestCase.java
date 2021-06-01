package test;

//import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Appender;
//import org.apache.log4j.ConsoleAppender;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;

import model.TestFields;
import page.SearchPageFactory;
import utilities.Log;
import utilities.ReadFromCsv;

public class TestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;
	ReadFromCsv read = new ReadFromCsv();
	@SuppressWarnings("static-access")
	List <TestFields> fields = read.readFieldsFromCsv("src\\utilities\\fields.csv");

	@Before
	public void setUp() throws Exception {

		driver = new FirefoxDriver();
		
		baseUrl = "https://formfaca.de/sm/lFnEJPB9T";
		
		searchPage = new SearchPageFactory(driver);
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		Log.info("Browser Started ...");
	
		
	}

	@Test
	public void test() throws Exception {
		
		//searchPage.nameTextBox(fields.get(0).getName());
		//searchPage.emailTextBox(fields.get(0).getEmail());
		//searchPage.phoneTextBox(fields.get(0).getPhone());
		//searchPage.experienceRadioButton(fields.get(0).getExperience());
		//searchPage.positionDropBox(1);
		//searchPage.uploadFile(fields.get(0).getFile());
		searchPage.clickSubmitButton();
		Log.info("Form Submitted ...");
		
		Assert.assertTrue(driver.findElements(By.xpath("//button[contains(text(),'Create your own form')]")).size() != 0);
		if(driver.findElements(By.xpath("//button[contains(text(),'Create your own form')]")).size() != 0) {
			Log.info("Test passed");
		}else {
		    Log.info("Test failed");
		}	
	}
	
	@After
	public void tearDown() throws Exception {
	}

}