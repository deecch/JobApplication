package page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import utilities.Log;



public class SearchPage {
	
	public static WebElement element = null;
	public static Select sel = new Select(element);
	/**
	 * Clear all the fields on the page
	 * @param driver
	 */
	
	/*public static void clearAllFields(WebDriver driver) {
		driver.findElement(By.name("entry.1781500597")).clear();
		driver.findElement(By.xpath("//div[@class='quantumWizTextinputPaperinputEl freebirdThemedInput freebirdFormviewerViewItemsDateDateInput modeLight']//input[@class='quantumWizTextinputPaperinputInput exportInput']")).clear();
		driver.findElement(By.xpath("//div[@class='freebirdFormviewerViewCenteredContent']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]")).clear();
	}*/
	/**
	 * @param driver
	 * @return
	 */
	public static WebElement nameTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='Widget322884199']"));
		Log.info("Enter name");
		return element;
	}
	/**
	 * @param driver
	 * @param origin
	 */
	public static void fillNameTextBox(WebDriver driver, String name) throws Exception {
		element = nameTextBox(driver);
		element.clear();
		element.sendKeys(name);
		element.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Log.info("Enter name" + name);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement positionDropBox(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[5]/select[1]"));
		return element;
	}
	
	/**
	 * @param driver
	 * @param date
	 * @throws Exception 
	 */
	public static void fillPositionDropBox(WebDriver driver, int position) throws Exception {
		element = positionDropBox(driver);
		sel.selectByIndex(position);
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
		Log.info("Enter position field" + position);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement emailTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='Widget1049550588']"));
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
		Log.info("Enter email adress" + email);
	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement phoneTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='Widget118987505']"));
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
		Log.info("Enter phone number" + phone);
	}
	
	
	public static WebElement position1MultipleSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='entry.1513009557.Less then one year']"));
		return element;
	}
	
	public static WebElement position2MultipleSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='entry.1513009557.1-2']"));
		return element;
	}
	
	public static WebElement position3MultipleSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='entry.1513009557.3 and more']"));
		return element;
	}
	
	
	public static void fillpositionMultipleSelect(WebDriver driver, int position1, int position2, int position3) throws Exception {
        if(position1 != 0) {
        	element = position1MultipleSelect(driver);
        	element.click();
        	Log.info("Enter experince field" + position1);
        }
        if(position2 != 0) {
        	element = position2MultipleSelect(driver);
        	element.click();
        	Log.info("Enter experince field" + position2);
        }
        if(position3 != 0) {
        	element = position3MultipleSelect(driver);
        	element.click();
        	Log.info("Enter experince field" + position3);
        }
		Thread.sleep(2000);
		element.sendKeys(Keys.TAB);
	}
	
	public static WebElement addButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Add file')]"));
		return element;
	}
	
	public static void uploadFile(WebDriver driver, String file) throws Exception {
		element = addButton(driver);
		element.click();
		
		Thread.sleep(3000);

		Robot robot = new Robot();
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec(file);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Log.info("Enter upoad ..." + file);
	}
	
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
		return element;
	}
	
	public static void clickSubmit(WebDriver driver) throws Exception {
		element = submit(driver);
		element.click();
		Thread.sleep(2000);
		Log.info("Submitted.");
	}
}