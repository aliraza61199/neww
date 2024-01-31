package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class countWordAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://google.com");
	WebElement ele=	d.findElement(By.id("APjFqb"));
	ele.sendKeys("muhammad ali wikipedia");
	d.findElement(By.id("jZ2SBf")).click();
		
		//d.findElement(By.className("zgAlFc")).click();
		d.findElement(By.xpath("//h3[text()='Muhammad Ali']")).click();
		

	}

}
