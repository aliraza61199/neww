package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.makemytrip.com/");
		d.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		d.findElement(By.className("close")).click();
		d.findElement(By.className("commonModal__close")).click();
		d.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		String month = "Feb";
		
		for(;;) {
			
			d.findElement(By.className("todayPrice"+month+"dateInnerCell"));	
   		   
				d.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			}
		}

	}


