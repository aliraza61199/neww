package SeleniumNEW;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		System.out.println("without useing click method");
		WebElement point = dr.findElement(By.xpath("//div[@class=\"header-text\"]"));
		System.out.println("2nd");
		
	}
}
