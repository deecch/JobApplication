package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SearchPageFactory {

	WebDriver driver;

	
	@FindBy(xpath="//input[@id='Widget322884199']")
	WebElement nameField;
	
	@FindBy(xpath="//input[@id='Widget1049550588']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Widget118987505']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='entry.1513009557.Less then one year']")
	WebElement expirienceField1;
	
	@FindBy(xpath="//input[@id='entry.1513009557.1-2']")
	WebElement expirienceField2;
	
	@FindBy(xpath="//input[@id='entry.1513009557.3 and more']")
	WebElement expirienceField3;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[5]/select[1]")
	WebElement position;
	
	@FindBy(xpath="//a[contains(text(),'Add file')]")
	WebElement addButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]")
	WebElement submit;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void nameTextBox(String name) throws InterruptedException {
		Thread.sleep(3000);
		nameField.sendKeys(name);
		Thread.sleep(3000);
		
	}
	
	public void emailTextBox(String emailField) throws InterruptedException {
		//email.clear();
		Thread.sleep(3000);
		email.sendKeys(emailField);
		Thread.sleep(3000);
	}
	
	public void phoneTextBox(String phoneField) {
		//phone.clear();
		phone.sendKeys(phoneField);
	}
	
	public void experienceRadioButton(int experienceField) throws InterruptedException {
		Thread.sleep(3000);
		if(experienceField == 1) {
			expirienceField1.click();
        }
        if(experienceField == 2) {
        	expirienceField2.click();
        }
        if(experienceField == 3) {
        	expirienceField3.click();
        }
        Thread.sleep(3000);
	}
	
	public void positionDropBox(int positionField) {
		//phone.clear();
		Select sl = new Select(position);
		sl.selectByIndex(positionField);
	}
	
	public void uploadFile(String file) throws AWTException, IOException, InterruptedException {
		addButton.click();
			
		Thread.sleep(3000);

		Robot robot = new Robot();
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec(file);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	public void clickSubmitButton() {
		submit.click();
	}
	
	
}
