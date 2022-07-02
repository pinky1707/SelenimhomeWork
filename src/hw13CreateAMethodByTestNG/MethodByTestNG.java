package hw13CreateAMethodByTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.network.model.TrustTokenOperationDone;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MethodByTestNG {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void urlTest() throws InterruptedException {
		driver.get("https://www.kroger.com");
		Thread.sleep(3000);
		
//hw13 done now i m going to push it to github

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
