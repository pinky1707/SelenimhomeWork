package hw14Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_click_methods {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("https://www.kroger.com/signin?redirectUrl=/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void signinButtonTest1() throws InterruptedException {
		driver.findElement(By.id("SignIn-submitButton")).click();  
		Thread.sleep(5000);
	}
	public void signButtonTest2() {
		driver.findElement(By.className("kds-Button kds-Button--primary w-full my-8")).click();;
	}
	public void signInEmailFieldTest3() {
		driver.findElement(By.name("name")).click();
	}
	
	
	public void logotest6() {
		driver.findElement(By.cssSelector("img.Image")).click();
	}
	public void signInButtonTest7() {
		driver.findElement(By.cssSelector("button#SignIn-submitButton")).click();// css Selrctor By Id
	}
	
	
	@AfterTest
	 public void tearUp() {
		 driver.quit();
	 }

}
