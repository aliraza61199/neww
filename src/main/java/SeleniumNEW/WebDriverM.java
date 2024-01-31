package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver dr= new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//dr.get("https://www.hyrtutorials.com/");
		dr.navigate().to("https://www.hyrtutorials.com/");
		String title=dr.getTitle();
		System.out.println("print Title" +title);
		String url=dr.getCurrentUrl();
		System.out.println("print the URL" +url);
		
		dr.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
		Thread.sleep(2000);

		dr.findElement(By.xpath("//a[text()='Window Handles']")).click();
//		dr.switchTo().defaultContent();
//		WebElement one=dr.findElement(By.id("dismiss-button"));
//		WebElement two=dr.findElement(By.xpath("//span[.=\"Close\"]"));
//	
//		
//		
//		if(dr.findElement(By.id("dismiss-button")).isEnabled()) {
//			dr.findElement(By.id("dismiss-button")).click();
//		}
//		else {
//			dr.findElement(By.xpath("//span[.=\"Close\"]")).click();
//		}
//		Thread.sleep(2000);
//		dr.findElement(By.id("dismiss-button")).click();
//
//		dr.findElement(By.id("newTabBtn")).click();
//		
//		
	}

}
