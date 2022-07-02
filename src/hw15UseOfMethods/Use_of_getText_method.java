package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getText_method { 
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void getTextTest() throws InterruptedException {
	WebElement text =	driver.findElement(By.xpath("(//a[text()='Wedding Registry'])[1]"));
		System.out.println("The text for the Web Element is:" + text.getText());
		//Wedding Registry
	} 

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
