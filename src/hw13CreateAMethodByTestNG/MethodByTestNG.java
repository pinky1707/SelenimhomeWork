package hw13CreateAMethodByTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MethodByTestNG {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.getProperties();
//		driver.setProperties();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void urlTest() throws InterruptedException {
		driver.get("https://www.kroger.com");
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
