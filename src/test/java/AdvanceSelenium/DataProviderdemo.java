package AdvanceSelenium;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
    @DataProvider(name="ALI")
	public Object[][] dataP()
	{
		Object[][] obj = {{"name","val","ali"},{"place","Phone","raza"}};
		return obj ;
	}
    @Test(dataProvider ="ALI")
    public void testcase(String data , String mob, String Name) {
    	System.out.println(data);
    	System.out.println(mob);
    	System.out.println(Name);
    }
	

}
