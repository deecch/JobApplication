package page;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;



public class SearchPage {
	public static WebElement element = null;
	static Logger log = Logger.getLogger(SearchPage.class);
	public static Select sel = new Select(element);
	/**
	 * Clear all the fields on the page
	 * @param driver
	 */
	
	public static void clearAllFields(WebDriver driver) {
		driver.findElement(By.name("entry.1781500597")).clear();
		driver.findElement(By.xpath("//div[@class='quantumWizTextinputPaperinputEl freebirdThemedInput freebirdFormviewerViewItemsDateDateInput modeLight']//input[@class='quantumWizTextinputPaperinputInput exportInput']")).clear();
		driver.findElement(By.xpath("//div[@class='freebirdFormviewerViewCenteredContent']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]")).clear();
	}
	/**
	 * @param driver
	 * @return
	 */
	/*public static WebElement nameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='entry.1781500597']"));
		log.info("Enter name");
		return element;
	}*/
	/**
	 * @param driver
	 * @param origin
	 */
	public static void fillNameTextBox(WebDriver driver, String name) throws Exception {
		driver.findElement(By.xpath("//input[@name='entry.1781500597']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='entry.1781500597']")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		log.info("Enter name" + name);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement birthTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='quantumWizTextinputPaperinputEl freebirdThemedInput freebirdFormviewerViewItemsDateDateInput modeLight']//input[@class='quantumWizTextinputPaperinputInput exportInput']"));
		log.info("Enter birth date");
		return element;
	}
	
	/**
	 * @param driver
	 * @param origin
	 */
	public static void fillBirthDateTextBox(WebDriver driver, String date1, String date2) throws Exception {
		element = birthTextBox(driver);
		element.sendKeys(date1);
		element.sendKeys(Keys.TAB);
		element.sendKeys(date2);
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement statusDropBox(WebDriver driver) {
		element = driver.findElement(By.xpath(""
				+ "//div[@class='freebirdFormviewerViewCenteredContent']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]"));
		return element;
	}
	
	/**
	 * @param driver
	 * @param date
	 * @throws Exception 
	 */
	public static void fillStatusDropBox(WebDriver driver, int status) throws Exception {
		element = statusDropBox(driver);
		sel.selectByIndex(status);
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement emailTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='entry.1640447617']"));
		return element;
	}
	
	/**
	 * @param driver
	 * @param date
	 */
	public static void fillemailTextBox(WebDriver driver, String email) {
		element = emailTextBox(driver);
		element.clear();
		element.sendKeys(email);
		element.sendKeys(Keys.TAB);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement phoneTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='entry.297979220']"));
		return element;
	}

	/**
	 * @param driver
	 */
	public static void fillPhoneTextBox(WebDriver driver, String phone) {
		element = phoneTextBox(driver);
		element.clear();
		element.sendKeys(phone);
		element.sendKeys(Keys.TAB);
	}
	
	public static WebElement employerTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("s//input[@name='entry.1774034311']"));
		return element;
	}

	/**
	 * @param driver
	 */
	public static void fillEmployerTextBox(WebDriver driver, String employer) {
		element = employerTextBox(driver);
		element.clear();
		element.sendKeys(employer);
		element.sendKeys(Keys.TAB);
	}
	
	public static WebElement experienceDropBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[9]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]"));
		return element;
	}
	
	public static void fillexpirienceDropBox(WebDriver driver, int experience) throws Exception {
		element = experienceDropBox(driver);
		sel.selectByIndex(experience);
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
	}
	
	public static WebElement position1MultipleSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewNumberedItemContainer']/div[@class='freebirdFormviewerViewItemsItemItem HasError']/div/div[1]/div[1]/label[1]/div[1]/div[1]/div[2]"));
		return element;
	}
	
	public static WebElement position2MultipleSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewNumberedItemContainer']/div[@class='freebirdFormviewerViewItemsItemItem HasError']/div/div[2]/div[1]/label[1]/div[1]/div[1]/div[2]"));
		return element;
	}
	
	public static WebElement position3MultipleSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewNumberedItemContainer']/div[@class='freebirdFormviewerViewItemsItemItem HasError']/div/div[3]/div[1]/label[1]/div[1]/div[1]/div[2]"));
		return element;
	}
	
	
	public static void fillpositionMultipleSelect(WebDriver driver, int position1, int position2, int position3) throws Exception {
        if(position1 != 0) {
        	element = position1MultipleSelect(driver);
        	element.click();
        }
        if(position2 != 0) {
        	element = position2MultipleSelect(driver);
        	element.click();
        }
        if(position3 != 0) {
        	element = position3MultipleSelect(driver);
        	element.click();
        }
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
	}
	
	public static WebElement addButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(@class,'appsMaterialWizButtonEl hasIcon appsMaterialWizButtonPaperbuttonEl appsMaterialWizButtonPaperbuttonHairline freebirdFormviewerViewItemsFileuploadAddButton isUndragged')]//span[contains(@class,'appsMaterialWizButtonPaperbuttonContent exportButtonContent hasIcon')]"));
		return element;
	}
	
	public static WebElement selectButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Select files from your device')]"));
		return element;
	}
	
	public static WebElement uploadButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='picker:ap:0']"));
		return element;
	}
	
	public static void uploadFile(WebDriver driver, String file) throws Exception {
		element = addButton(driver);
		element.click();
		element = selectButton(driver);
		element.click();
		
		StringSelection ss = new StringSelection("C:\\Users\\komp\\Desktop\\1.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Ctrl + v
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		element = uploadButton(driver);
		element.click();
		element.sendKeys(Keys.TAB);
	}
	
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		return element;
	}
	
	public static void clickSubmit(WebDriver driver, int experience) throws Exception {
		element = submit(driver);
		element.click();
		Thread.sleep(2000);
	}
}