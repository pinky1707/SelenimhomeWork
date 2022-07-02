package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_sendKeys_method02 { 
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void searchingProductTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("women watch", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).clear();
		Thread.sleep(3000);
		//PASSED: searchingProductTest

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
