package hw16UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_based_alert { 
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://enthrallit.com/selenium/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void acceptTheAlertFromWeb() throws InterruptedException {
		 driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The text of the Alert is : " + alert.getText());
		alert.accept();
	}
	@Test(enabled = true, priority = 2)
	public void dismissTheAlertFromWeb() throws InterruptedException {
		 driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	//The text of the Alert is : I am a JS Confirm
	//PASSED: acceptTheAlertFromWeb
	//PASSED: dismissTheAlertFromWeb
	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
