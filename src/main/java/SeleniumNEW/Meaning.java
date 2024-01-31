package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meaning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("english word meaning with hindi");
		Thread.sleep(2000);
		driver.findElement(By.id("jZ2SBf")).click();
		driver.findElement(By.xpath("//h3[text()='450+ Common English words with Hindi meaning']")).click();
		
		driver.findElement(By.xpath("//span[text()='x']")).click();
		
		WebElement ele =driver.findElement(By.xpath("//span[contains(text(),'A से Z Common English words used in Daily Life with Hindi meaning')]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		System.out.println("raza");
		js.executeScript("arguments[0].scrollIntoView();",ele);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='Appendix']")).click();
		
		WebElement ele2=  driver.findElement(By.id("h-ल-स-ट-ऑफ-क-मन-इ-ग-ल-श-वर-ड-स"));
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();" ,ele2);
		
		System.out.println(ele2.getText());
	
	}

}
