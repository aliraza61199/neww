package AdvanceSelenium;

import org.testng.annotations.DataProvider;

public class Dataprovider01 {
	@DataProvider(name="testing")
	public Object[][] dataprovider(){
		Object[][] obj = {{"name","val"},{"phone","nokia"}};
		return obj;
		
	}
}
