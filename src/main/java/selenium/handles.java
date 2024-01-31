package selenium;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handles {
	public static WebDriver d;
	public static void switchingTo(String ExpectedTitle, String parentID,Set<String> allID) {
		//[ChildWindow]
		//System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
//	WebDriverManager.chromedriver().setup();
//		WebDriver d= new ChromeDriver();
//		d.manage().window().maximize();
		
	
//		String expectedTitle= "ANP BEE Raw )Unpasteurized Honey Pure";
//		
		allID.remove(parentID);
		for(String id:allID) {
			d.switchTo().window(id);
			if(d.getTitle().contains(ExpectedTitle)) {
			break;
		}
	}
	}
	public static void switchingBackWindow(String parentID, String string) {
		d.switchTo().window(parentID);
		}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		d.get("https://www.snapdeal.com/");
		String parentID= d.getWindowHandle();
		d.findElement(By.xpath("//div[text()='ANP BEE Raw Unpasteurized Honey Pure & Natural Honey 1 kg']"));
		switchingBackWindow("ANP BEE Raw Unpasteurized Honey Pure & Natural Honey",d.getWindowHandle());
          
		 Set<String> allID = d.getWindowHandles();
		d.findElement(By.xpath("//span[text()='add to cart']")).click();
		
		
	
	
			
		}
		
		
	}



