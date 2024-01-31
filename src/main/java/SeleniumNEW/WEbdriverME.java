package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEbdriverME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.get("https://demoqa.com/alerts");
        String title=dr.getTitle();
        System.out.println("print Title" + title);
        String url = dr.getCurrentUrl();
        System.out.println("print  current url " + url);
        Thread.sleep(2000);
         dr.findElement(By.xpath("//span[.='Browser Windows']")).click();
         dr.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
	}

}
