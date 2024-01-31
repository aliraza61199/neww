package register;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager .chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Jerseys starting ₹999']")).click();
		driver.findElement(By.xpath("")).click();
	Set<String> all=driver.getWindowHandles();
	}

}
