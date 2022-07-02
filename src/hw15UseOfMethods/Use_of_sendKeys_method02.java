package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
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
		driver.get("https://www.aetna.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void signInTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='header__loginbtn btn--primary megamenu__loginbtn--btn'] )[1]")).click();
//	driver.findElement(By.xpath("(//ton[@class='nav__search--icon'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@class='nav__search--icon'])[1]")).sendKeys("Health benefits", Keys.ENTER);
	driver.findElement(By.xpath("(//button[@class='nav__search--icon'])[1]")).clear();
	Thread.sleep(3000);
	
	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
