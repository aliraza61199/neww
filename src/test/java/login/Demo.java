package login;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class Demo extends BaseClass {
	@Test
	public void demo1() {
	assertFalse(true);
	}
	
}
	