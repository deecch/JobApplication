package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPageFactory {

	WebDriver driver;

	
	@FindBy(xpath="//input[@name='entry.1781500597']")
	WebElement nameField;
	
	@FindBy(xpath="//input[@name='entry.1640447617']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='entry.297979220']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='entry.1774034311']")
	WebElement employer;
	
	@FindBy(xpath="//body[contains(@class,'freebirdLightBackground')]/div[contains(@class,'freebirdFormviewerViewFormContentWrapper')]/div[contains(@class,'freebirdFormviewerViewCenteredContent')]/form[@id='mG61Hd']/div[contains(@class,'freebirdFormviewerViewFormCard exportFormCard')]/div[contains(@class,'freebirdFormviewerViewFormContent')]/div[contains(@class,'freebirdFormviewerViewItemList')]/div[contains(@class,'freebirdFormviewerViewNumberedItemContainer')]/div[contains(@class,'freebirdFormviewerViewItemsItemItem')]/div/div[contains(@class,'appsMaterialWizToggleRadiogroupGroupContainer exportGroupContainer freebirdFormviewerViewItemsRadiogroupRadioGroup')]/span[contains(@class,'appsMaterialWizToggleRadiogroupGroupContent exportGroupContent')]/div[contains(@class,'freebirdFormviewerViewItemsRadioChoicesContainer')]/div[1]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]")
	WebElement expirienceField1;
	
	@FindBy(xpath="//body[contains(@class,'freebirdLightBackground')]/div[contains(@class,'freebirdFormviewerViewFormContentWrapper')]/div[contains(@class,'freebirdFormviewerViewCenteredContent')]/form[@id='mG61Hd']/div[contains(@class,'freebirdFormviewerViewFormCard exportFormCard')]/div[contains(@class,'freebirdFormviewerViewFormContent')]/div[contains(@class,'freebirdFormviewerViewItemList')]/div[contains(@class,'freebirdFormviewerViewNumberedItemContainer')]/div[contains(@class,'freebirdFormviewerViewItemsItemItem')]/div/div[contains(@class,'appsMaterialWizToggleRadiogroupGroupContainer exportGroupContainer freebirdFormviewerViewItemsRadiogroupRadioGroup')]/span[contains(@class,'appsMaterialWizToggleRadiogroupGroupContent exportGroupContent')]/div[contains(@class,'freebirdFormviewerViewItemsRadioChoicesContainer')]/div[2]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]")
	WebElement expirienceField2;
	
	@FindBy(xpath="//body[contains(@class,'freebirdLightBackground')]/div[contains(@class,'freebirdFormviewerViewFormContentWrapper')]/div[contains(@class,'freebirdFormviewerViewCenteredContent')]/form[@id='mG61Hd']/div[contains(@class,'freebirdFormviewerViewFormCard exportFormCard')]/div[contains(@class,'freebirdFormviewerViewFormContent')]/div[contains(@class,'freebirdFormviewerViewItemList')]/div[contains(@class,'freebirdFormviewerViewNumberedItemContainer')]/div[contains(@class,'freebirdFormviewerViewItemsItemItem')]/div/div[contains(@class,'appsMaterialWizToggleRadiogroupGroupContainer exportGroupContainer freebirdFormviewerViewItemsRadiogroupRadioGroup')]/span[contains(@class,'appsMaterialWizToggleRadiogroupGroupContent exportGroupContent')]/div[contains(@class,'freebirdFormviewerViewItemsRadioChoicesContainer')]/div[3]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]")
	WebElement expirienceField3;
	
	@FindBy(xpath="//body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewNumberedItemContainer']/div[@class='freebirdFormviewerViewItemsItemItem HasError']/div/div[1]/div[1]/label[1]/div[1]/div[1]/div[2]")
	WebElement position1MultipleSelection;
	
	@FindBy(xpath="//body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewNumberedItemContainer']/div[@class='freebirdFormviewerViewItemsItemItem HasError']/div/div[2]/div[1]/label[1]/div[1]/div[1]/div[2]")
	WebElement position2MultipleSelection;
	
	@FindBy(xpath="//body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewNumberedItemContainer']/div[@class='freebirdFormviewerViewItemsItemItem HasError']/div/div[2]/div[1]/label[1]/div[1]/div[1]/div[2]")
	WebElement position3MultipleSelection;
	
	@FindBy(xpath="//div[@class='appsMaterialWizButtonEl hasIcon appsMaterialWizButtonPaperbuttonEl appsMaterialWizButtonPaperbuttonHairline freebirdFormviewerViewItemsFileuploadAddButton']//span[@class='appsMaterialWizButtonPaperbuttonContent exportButtonContent hasIcon']")
	WebElement addButton;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submit;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void nameTextBox(String name) {
		nameField.sendKeys(name);
	}
	
	public void emailTextBox(String emailField) {
		email.clear();
		email.sendKeys(emailField);
	}
	
	public void phoneTextBox(String phoneField) {
		phone.clear();
		phone.sendKeys(phoneField);
	}
	
	public void employerTextBox(String employerField) {
		employer.clear();
		employer.sendKeys(employerField);
	}
	
	public void experienceRadioButton(int experienceField) {
		if(experienceField == 1) {
			expirienceField1.click();
        }
        if(experienceField == 2) {
        	expirienceField2.click();
        }
        if(experienceField == 3) {
        	expirienceField3.click();
        }
	}
	
	public void positionMultipleSelect(int position1, int position2, int position3) {
		if(position1 != 0) {
			position1MultipleSelection.click();
        }
        if(position2 != 0) {
        	position2MultipleSelection.click();
        }
        if(position3 != 0) {
        	position3MultipleSelection.click();
        }
  	}
	
	public void uploadFile(String file) throws AWTException, IOException, InterruptedException {
		addButton.click();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec(file);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	public void clickSubmitButton() {
		submit.click();
	}
	
	
}
