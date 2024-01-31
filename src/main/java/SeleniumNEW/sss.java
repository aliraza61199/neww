package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sss {
	public static void main(String[] args) {
		
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver d =new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://google.com");
	d.findElement(By.className("gLFyf")).sendKeys("happy");
    

	
	}  
}
