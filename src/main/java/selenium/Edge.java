package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.bing.com");
		d.findElement(By.id("id_p")).click();
		d.findElement(By.xpath("//span[text()=\"Sign out\"]")).click();
		d.findElement(By.id("id_l")).click();
		d.findElement(By.id("id_s")).click();

	
//		d.findElement(By.name("q")).sendKeys("sing",Keys.ENTER);
//		d.findElement(By.name("q")).sendKeys("abstract",Keys.ENTER);
//		d.findElement(By.name("q")).sendKeys("collection",Keys.ENTER);
//		d.findElement(By.name("q")).sendKeys("exception",Keys.ENTER);
//		d.findElement(By.name("q")).sendKeys("ram",Keys.ENTER);
//		d.findElement(By.name("q")).sendKeys("rom",Keys.ENTER);
//		driver.findElement(By.name("q")).sendKeys("array",Keys.ENTER);
//		driver.findElement(By.name("q")).sendKeys("listarry",Keys.ENTER);
//		d
	}

}
