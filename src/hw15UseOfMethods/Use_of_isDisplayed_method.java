package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isDisplayed_method { 
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("https://www.kroger.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void logoTest() {
		boolean elementDisplayed=driver.findElement(By.xpath("//img[@class='Image']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed); 
	  //Is the logo displayed? Ans: true
	       //PASSED: logoTest
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
