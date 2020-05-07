package test;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;
import page.SearchPageFactory;


public class TestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;
	static Logger log = Logger.getLogger(TestCase.class);
	static Appender append;

	@Before
	public void setUp() throws Exception {
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("automationprofiles");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);
		driver = new FirefoxDriver(options);
		
		baseUrl = "https://docs.google.com/forms/d/e/1FAIpQLScPQN1X8YhJQj7Oq-Rq248ialdUVFThc5atKG-a8ogmHIUQSQ/viewform";
		
		final PatternLayout layout = new PatternLayout();
		layout.setConversionPattern("%d{yyyy-MM-dd} --%-10p %c{1} -%m%n");
		append = new ConsoleAppender(layout);
		log.addAppender(append);
		log.setLevel(Level.INFO);
		
		searchPage = new SearchPageFactory(driver);
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		searchPage.nameTextBox("Petar");
		searchPage.emailTextBox("petar@gmail.com");
		searchPage.phoneTextBox("222-333");
		searchPage.employerTextBox("manager");
		searchPage.experienceRadioButton(1);
		searchPage.positionMultipleSelect(1, 0, 1);
		searchPage.uploadFile("C:\\Users\\komp\\Selenium\\JobApplication\\Scripts\\fileupload1.exe");
		searchPage.clickSubmitButton();
		

		boolean result = driver.findElements(By.xpath("//form[@id='new_user']//div[3]")).size() != 0;
		Assert.assertFalse(result);
		log.info("Test is" + result);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}