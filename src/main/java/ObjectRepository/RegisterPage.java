package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy()
	private WebElement genderRadioButton;
	@FindBy(id="FirstName")
	private WebElement firstnameTF;
	
	@FindBy(id ="LastName")
	private WebElement lastnameTextfield;
	}
	


