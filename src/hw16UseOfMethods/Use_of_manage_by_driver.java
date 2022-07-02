package hw16UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_manage_by_driver {
	FirefoxDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test(enabled = true,priority = 1)
	public void maximizeWindowTest() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test (enabled = true,priority = 2)
	public void fullScreenWindowTest() throws InterruptedException {
		driver.get("https://www.aetna.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
	}

	@Test (enabled = true,priority = 3)
	public void sizeOfWindowTest() throws InterruptedException {
		driver.get("https://www.meijer.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		System.out.println("The size of the screen is : " + driver.manage().window().getSize()); //(1280, 720)
	}

	@Test (enabled = true,priority = 4)
	public void deleteAllCookiesTest() throws InterruptedException {
		driver.get("https://www.kroger.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
	}

	@Test (enabled = true,priority = 5)
	public void setASpecificSizeOfWindowTest() throws InterruptedException {
		Dimension dimension = new Dimension(700, 400);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://enthrallit.com/");
		Thread.sleep(3000);
		System.out.println("The size of the screen is : " + driver.manage().window().getSize());
	}
	@Test(enabled = false, priority = 6)
	public void pageLoadTimeoutForWindowTest() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	
		driver.get("https://www.macys.com/");
	}
	@Test(enabled = false, priority = 7)
	public void implecitlywaitTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ikea.com/");
	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
