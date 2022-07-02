package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getCurrentUrl_by_firefoxDriver {   
	WebDriver driver;
	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.aetna.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	}
	@Test
	public void currentPgeUrlTest() throws InterruptedException {
		driver.findElement(By.xpath("//img[@class='logo lazyloaded']")).click();
		Thread.sleep(3000);
		System.out.println("The current Url :" + driver.getCurrentUrl());//The current Url :https://www.aetna.com/
		
	}
	@AfterTest
	public void tearUp()  {
		driver.quit();
		
	}
}
