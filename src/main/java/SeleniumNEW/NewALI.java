package SeleniumNEW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewALI
{

  public static void main(String[] args) throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver","./selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	driver.manage().window().maximize();
	driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=15&id=264960&wreply=https%3a%2f%2fwww.bing.com%2fsecure%2fPassport.aspx%3fedge_suppress_profile_switch%3d1%26requrl%3dhttps%253a%252f%252fwww.bing.com%252f%253fwlexpsignin%253d1%26sig%3d2D7463EF29166E5B0BDE708E28A46FA8%26nopa%3d2&wp=MBI_SSL&lc=1033&CSRFToken=bedb7ca2-16a1-4eb7-8737-6840813db3a5&aadredir=1&nopa=2");
	
	//driver.findElement(By.id("i0116")).sendKeys("raja.ali209845@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("mahboobansari10897@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("aliraza61199@gmail.com");
	driver.findElement(By.id("i0116")).sendKeys("a.r06shorts@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("genelia61199@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("chotyraza060194@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("naazparween181@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("salmanansari101204@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("newartandcraft907@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("shammaazhari@gmail.com");

	//driver.findElement(By.id("i0116")).sendKeys("salman101004@gmail.com");
	
	//driver.findElement(By.id("i0116")).sendKeys("arunksahoo21@gmail.com");
	//driver.findElement(By.id("i0116")).sendKeys("avayakumarsahoo@gmail.com");

	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
    //driver.findElement(By.id("i0118")).sendKeys("Ali@1403");
   //driver.findElement(By.id("i0118")).sendKeys("Mahboob@143");
	driver.findElement(By.id("i0118")).sendKeys("Aliraza060194@");
	//driver.findElement(By.id("i0118")).sendKeys("Aliraza61199@");
	//driver.findElement(By.id("i0118")).sendKeys("Papa@143");
	//driver.findElement(By.id("i0118")).sendKeys("Mama@143");


    

	//driver.findElement(By.xpath("//input[@id=\"idSIButton9\"]")).click();
    Thread.sleep(3000);
	driver.findElement(By.id("idSIButton9")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("idBtn_Back")).click();

	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("sing",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("abstract",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("collection",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("exception",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("overridden",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("array",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("listarry",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rorr",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rome",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("string",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("immutable",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("ro",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rohc",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rohad",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("roh",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("an16",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("hq",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rohan18",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("h19",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rohan20",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("roh21",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("g",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("oh23",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("ro24",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("r25",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("ron26",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("r27",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("rohan28",Keys.ENTER);
	driver.findElement(By.name("q")).sendKeys("roh29",Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("rohan30",Keys.ENTER);
    Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//span[@id='id_n']")).click();
	//driver.findElement(By.xpath("//span[@class='id_link_text']")).click();
	//driver.findElement(By.className("loginfmt"));
	
	
	
	Thread.sleep(2000);
	//driver.close();
	
  }
}