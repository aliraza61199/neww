package login;

import org.testng.annotations.Test;

import Generic.BaseClass;


public class DWS_01_Test extends BaseClass {

@Test

public void Login_with_valid_credentials() {
	login.getLogin().click();
	login.getEmail().sendKeys("demo@gmail.com");
	login.getPassword().sendKeys("************");
	login.getLoginbtn().click();	
	}

}
