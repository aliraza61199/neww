package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.Loginpage;
import ObjectRepository.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
public static WebDriver driver;
   
	   //when chromebrowser is nit  opening use this 1st two lines
	   //when we update chromedriver.exe it will not remove that old version
	   //so inOrder to delete that old version we will  use  these 2 line 
	   
	   //WebDriverManager.ChromeDriver().ClearDriverCache().Setup();
	//WebDriverManager.ChromeDriver().ClearResalution().Setup();
         public  static JavaScriptUtility js;
  // public  static  ITestListenerUtility 
      public static  PropertyUtility  pu ;  
      public static Loginpage login;
      public static RegisterPage register;
     
      
  
  @BeforeClass
  public void  launchingbrowser(WebDriver driver) {
	  pu=new PropertyUtility(); //initialize the pu object
	  js = new JavaScriptUtility();
//	  if(pu.readingDataFromPropertiesFile("browser").equalsIgnoreCase("chrome")) {
//		  WebDriverManager.chromedriver().setup();
//				  WebDriverManager.chromedriver().setup();
//		          driver =new EdgeDriver();
//			  }
//	  
//	  else
	 // if(pu.readingDataFromPropertiesFile("browser").equalsIgnoreCase("edage")) {
//		  
//			  driver.manage().window().maximize();
//			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	  }
  @BeforeMethod
  public void navigatingToApplication() {
	  login =new Loginpage(driver);
	  register= new RegisterPage(driver);
  }		   
  public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new  ChromeDriver();
			Thread.sleep(2000);
			driver.quit();
		}
			  }	  

