package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(className =  "Log in ")
private WebElement   login;
public WebElement getLogin() {
	return login;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public WebElement getSearchbar() {
	return searchbar;
}
@FindBy(id="Email")
private WebElement email;
@FindBy(id="passwoord")
private WebElement password;
@FindBy(xpath="(//input[@type='submit'])[2]")
private WebElement loginbtn;
@FindBy(id="small-searchterms")
private WebElement searchbar;

}
