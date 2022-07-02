package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getAttribute_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://signin.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void getAttributeTest() {
		String value01 = driver.findElement(By.xpath("//a[text()='create an account']")).getAttribute("id");
		System.out.println("The value of the id attribute: " + value01); // id="create-account-link"
	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
