package hw14Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_click_method_02 {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
       driver.get("https://www.Macys.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void macysJobsTest4() {
		driver.findElement(By.linkText("MacysJOBS")).click();
	}
	public void macysJobsTest5() {
		driver.findElement(By.partialLinkText("MacysJ")).click();
	}


	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	

}
