package register;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	@Test
	public  void main() throws InterruptedException {
		
		// System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone 14", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		Thread.sleep(2000);
		// String id=driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();

		for (String tab : allid) {

			driver.switchTo().window(tab);
		}

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

		String ele = driver.findElement(By.xpath("//a[text()='APPLE iPhone 14 (Blue, 128 GB)']")).getText();
		org.testng.Assert.assertEquals(ele, "APPLE iPhone 14 (Blue, 128 GB)");
	}

}
