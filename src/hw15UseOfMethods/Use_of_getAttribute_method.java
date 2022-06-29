package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getAttribute_method {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.kroger.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void getAttributeTest() {
		String value01= driver.findElement(By.xpath("//button[text()='Departments']")).getAttribute("ID");
		System.out.println("The value of the id attribute: " + value01); //ExposedMenu-Category-Departments id
		
		
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
