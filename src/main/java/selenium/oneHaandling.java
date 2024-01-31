package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oneHaandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Under ₹499 | Pots, pans & more']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Pigeon By Stovekraft Favourite Aluminium Pressure Cooker with Outer Lid Gas Stove Compatible 3 Litre Capacity for Healthy Cooking (Silver)')]")).click();
		driver.findElement(By.xpath("//a[text()=' Add to Cart ']")).click();
		driver.findElement(By.xpath("")).click();
		
		
		
		

	}

}
