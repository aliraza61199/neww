package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Generic.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase  {  //testScript

	@Test(dataProvider="testing",dataProviderClass =  Dataprovider01.class)
	public void testcase(String data ,String mob) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote- allow-origin=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(data);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(mob);
//		System.out.println(data);
//		System.out.println(mob);
		
		driver.quit();
	}
}
