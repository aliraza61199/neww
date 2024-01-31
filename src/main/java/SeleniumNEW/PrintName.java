package SeleniumNEW;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintName {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new  ChromeDriver();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.get("https://www.amazon.in/");
	WebElement 	ele=dr.findElement(By.id("twotabsearchtextbox"));
	ele.sendKeys("new phones");
	dr.findElement(By.id("nav-search-submit-text")).click();
	//List<WebElement> ele1=dr.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]"));//("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
	 for(int i=1;i<=20;i++) {
		 List<WebElement> ele1=dr.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]"));//("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
		 for(WebElement e:ele1) {
				System.out.println(e.getText());
			}
		 WebElement element=dr.findElement(By.linkText("Next"));
		 JavascriptExecutor js=(JavascriptExecutor)dr;
			js.executeScript("arguments[0].scrollIntoView();",element);
			Thread.sleep(2000);
                element.click();
	 }
	
	
	}

}
